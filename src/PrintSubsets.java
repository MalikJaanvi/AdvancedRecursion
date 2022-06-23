
// Print all the subsets of a set of first n natural numbers.

import java.util.ArrayList;

public class PrintSubsets {
    //123 -->123,12,13,23,1,2,3,
    public static void subsets(int n,ArrayList<Integer> subset){
        if(n==0){
            displaySubset(subset);
            return;
        }
        //add on
        subset.add(n);
        subsets(n-1,subset);
        //else
        subset.remove(subset.size()-1);
        subsets(n-1,subset);
    }

    private static void displaySubset(ArrayList<Integer> subset) {
        for (int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(3,subset);
    }
}
