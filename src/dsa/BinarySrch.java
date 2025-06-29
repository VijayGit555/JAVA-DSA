package dsa;

public class BinarySrch {

    public static void main(String[] args) {
    int[] descArry = {100,90,40,60,32,22,11,5,-1};
    int[] ascArry ={10,11,15,20,700,900};
        System.out.println(orderAgnosticBinarySearch(ascArry,700));
    }

    public static int orderAgnosticBinarySearch(int[] ary, int target) {
        int start = 0;
        int end = ary.length - 1;
        boolean isAsc = ary[start] < ary[end];
        System.out.println(" isAsc "+isAsc);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("mid  index " + mid);
            if (ary[mid] == target) {
                System.out.println(" index found ");
                return mid;
            }
            if (isAsc) {
                if (ary[mid] < target) {
                    System.out.println("in if ");
                    start = mid + 1;
                } else {
                    System.out.println("in else if");
                    end = mid - 1;
                }
            } else {
                if (ary[mid] < target) {
                    System.out.println("in if ");
                    end = mid - 1;
                } else {
                    System.out.println("in else if");
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
