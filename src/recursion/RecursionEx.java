package recursion;



public class RecursionEx {

    public static void main(String[] args) {
//        System.out.println(fibbonaci(5));
        int[] arr = {20,40,41,45,50,99};
        System.out.println(binarysearch(arr,50,0,arr.length-1));
    }

    static void printNum(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    static int fibbonaci(int n) {

        if (n < 2) {
            return n;
        }
        int a = fibbonaci(n-1);
        int b = fibbonaci(n-2);
        return a+b;
    }

    static int binarysearch(int[] arr,int target, int start , int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end -start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if (arr[mid] > target){
            return binarysearch(arr,target,start,mid -1);
        }
        return binarysearch(arr,target,mid+1,end);

    }

}
