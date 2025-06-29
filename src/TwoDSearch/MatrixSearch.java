package TwoDSearch;

import java.util.Arrays;

public class MatrixSearch {

    public static void main(String[] args) {
        int[][] ar = {{1, 10, 20},
                {2, 20, 21},
                {3, 21, 22},
                };
        System.out.println(Arrays.toString(twoDbinarySearch(ar,10)));
//        System.out.println(Arrays.toString(sortedMatrixBinarySearch(ar, 0)));
//        System.out.println(ar[0].length-1);
    }


    private static int[] twoDbinarySearch(int[][] arry, int tgt) {
        int r = 0;
        int c = arry.length - 1;
        while (r < arry.length && c >= 0) {

            if (arry[r][c] == tgt) {
                return new int[]{r, c};
            }

            if (arry[r][c] > tgt) {
                c--;
            } else {
                r++;
            }

        }
        return new int[]{-1, -1};
    }

    private static int[] sortedMatrixBinarySearch(int[][] ar, int tgt) {
        int rows = ar.length;
        int cols = ar[0].length;

        if (rows == 1) {
            return binarySearch(ar, 0, 0, cols - 1, 30);
        }
        int rStart = 0;
        int rowEnd = rows - 1;
        int cMid = cols / 2;
        //condition to check atleast the matrix size > 2
        while (rStart < (rowEnd - 1)) {
            int mid = rStart + (rowEnd - rStart) / 2;
            int val = ar[mid][cMid];
            if (val == tgt) {
                return new int[]{mid, cMid};
            }
            if (val < tgt) {
                rStart = mid;
            } else {
                rowEnd = mid;
            }

        }

        if (ar[rStart][cMid] == tgt) {
            return new int[]{rStart, cMid};
        }
        if (ar[rStart + 1][cMid] == tgt) {
            return new int[]{rStart + 1, cMid};
        }

        if (ar[rStart][cMid + 1] <= tgt && ar[rStart][cols - 1] >= tgt) {
            return binarySearch(ar, rStart, cMid + 1, cols - 1, tgt);
        } else if (ar[rStart + 1][cMid + 1] <= tgt && ar[rStart + 1][cols - 1] >= tgt) {
            return binarySearch(ar, rStart + 1, cMid + 1, cols - 1, tgt);
        }
        if (ar[rStart][cMid - 1] >= tgt) {
            return binarySearch(ar, rStart, 0, cMid - 1, tgt);
        } else if (ar[rStart + 1][cMid - 1] >= tgt) {
            return binarySearch(ar, rStart + 1, 0, cMid - 1, tgt);
        }
        return new int[]{-1, -1};
    }

    public static int[] binarySearch(int[][] ar, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (ar[row][mid] == target) {
                return new int[]{row, mid};
            }

            if (ar[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};

    }

}

