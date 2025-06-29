package dsa;


//All Methods are Practices of array.
public class MountainArray {
    public static void main(String[] args) {
       int[] i = {1,2,3,4,5,6,4,3,2,1};
        System.out.println(findInMoutnArry(i,6));
    }

    public static int findPeakinMountainArray(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end -start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return end;
    }

    public static int[] findInMoutnArry(int[] arr, int tar){
        int[] rtrn = {2};
        int peakElInArray = findPeakinMountainArray(arr);
        rtrn[0]= orderAgnosticBinarySearch(arr,tar,0,peakElInArray);
        rtrn[1] = orderAgnosticBinarySearch(arr,tar,peakElInArray+1,arr.length-1);
        return rtrn;
    }

    public static int orderAgnosticBinarySearch(int[] ary, int target,int st, int ed) {
        int start = st;
        int end = ed;
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
