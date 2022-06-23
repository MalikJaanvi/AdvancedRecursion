
// Place tiles of size 1xn in a floor of size mxn

public class PlaceTiles {
    public static int placeTiles(int m, int n){
        if (m==n){
            return 2;
        }
        if (m<n){
            return 1;
        }

        int placeVertically = placeTiles(m-n,n);
        int placeHorizontally = placeTiles(m-1,n);
        return placeHorizontally + placeVertically;
    }

    public static void main(String[] args) {
        System.out.println(placeTiles(3,3));
    }
}
