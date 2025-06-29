package dsa;

import java.util.Scanner;

public class SearchOperationsArrays {
    public static void main(String[] args) {
    int[] array ={10,100,34,76,45};
        Scanner in = new Scanner(System.in);
    boolean a = linearSearch(array,in.nextInt());
        System.out.println(" Is the value found in Array "+ a);
    }

    static boolean linearSearch(int[] ary, int find){
        if(ary.length==0){
            return false;
        }
        for (int i: ary){
            if(i == find){
                return true;
            }
        }
       return false;
    }
}
