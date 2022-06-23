
// Find all permutation of a string

public class PrintPermutation {
    //abc -->abc,acb,bac,bca,cab,cba
    public static void permutation(String str,String Permutation){
        if (str.length()==0) {
            System.out.println(Permutation);
            return;
        }
        for (int i=0;i<str.length();i++){
            char currentchar = str.charAt(i);
            String substr = str.substring(0,i)+str.substring(i+1);
            permutation(substr,Permutation+currentchar);
        }
    }

    public static void main(String[] args) {
        String str ="abc";
        permutation(str,"");
    }
}
