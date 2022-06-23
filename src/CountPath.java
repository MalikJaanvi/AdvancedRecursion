
// Count total paths in a maze to move from (0,0) to (n,m)

public class CountPath {
    public static int countPath(int i, int j , int m, int n){//3x4
        if(i==n && j==m ){
            return 0;
        }
        if(i==n-1 || j==m-1){
            return 1;
        }
        int downwards = countPath(i+1,j,m,n);
        int forwards = countPath(i, j+1, m, n);
        return downwards + forwards;
    }

    public static void main(String[] args) {
        int total = countPath(0,0,3,3);
        System.out.println(total);
    }
}
