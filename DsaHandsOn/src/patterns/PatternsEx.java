package patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatternsEx {

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern28(5);
//        pattern17(5);
//        pattern8(5);
//        pattern31(4);
        pattern6(4);

    }

    private static void pattern6(int i) {
        for (int row = 0; row < i * 2; row++) {
            int count = (row >= i) ? 2 * i - row - 1 : row;
            int spaces = (row > i) ? row - i : i - row - 1;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= count; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

    public static void pattern5(int n) {
        for (int row = 1; row < n * 2; row++) {
            int totalNoOfCol = row > n ? n * 2 - row : row;

            for (int col = 1; col <= totalNoOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern28(int n) {
        for (int row = 1; row < n * 2; row++) {
            int totalNoOfCol = row > n ? n * 2 - row : row;
            int totalNoSpaces = row > n ? row - n : n - row;
            for (int s = 0; s < totalNoSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalNoOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern17(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = row; col > 1; col--) {
                System.out.print(col);
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }

    public static void pattern8(int n) {
        for (int row = 1; row < n * 2; row++) {
            int noOfSpaces = row > n ? row - n : n - row;
            int cols = row > n ? 2 * n - row : row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }
            for (int col = cols; col > 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 1; col <= cols; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

    public static void pattern31(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            for (int col = 1; col <= 2 * n; col++) {
                int left = col - 1;
                int right = 2 * n - col;
                int up = row - 1;
                int down = 2 * n - row;
                int atEveryIndex = Math.min(Math.min(left, right), Math.min(up, down));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}


