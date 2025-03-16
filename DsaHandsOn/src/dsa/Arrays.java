package dsa;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[][] ints = new int[3][2];
//        ints = new int[][]{
//                {2, 3, 4},
//                {5, 9, 6},
//                {2, 0,}
//        };
        Scanner sc = new Scanner(System.in);
        for (int row=0;row<ints.length;row++){
            for(int col=0;col<ints[row].length;col++){
                ints[row][col] = sc.nextInt();
            }

        }
//    for (int row=0;row<ints.length;row++){
//        for (int col=0;col<ints[row].length;col++){
//            System.out.print(ints[row][col]+" ");
//        }
//        System.out.println();
//    }

        for (int row =0;row< ints.length;row++) System.out.println(java.util.Arrays.toString(ints[row]));


    }
}
