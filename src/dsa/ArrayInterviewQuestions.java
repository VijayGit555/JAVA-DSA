package dsa;

import java.util.Arrays;

public class ArrayInterviewQuestions {

    public static void main(String[] args) {
//        int[] arr = {10,33,44,65,77,89};
//        char[] chArr = {'c','d','e','f','g'};
        int[] arr = {2,3,10,10,10,10,33,10};
//        System.out.println(Arrays.toString(fstAndLst(arr,10)));

        System.out.println(ceilingOfNumber(arr,10));
//        System.out.println(floorOfNumber(arr, 70));
//        System.out.println(chArr[smallestLetter(chArr,'c')]);
    }

    //smallest no => target in an array
    static int ceilingOfNumber(int[] array, int target){
       int start =0;
       int end = array.length-1;
       if (array[end]<target){
           return -1;
        }
      boolean isAsc = array[start]<array[end];
       while(start<=end){
           int mid = start + (end - start)/2;
           if(array[mid]==target){
              return mid;
           }
           if(isAsc){
               if(array[mid]<target){
                   start= mid +1;
               }else{
                   end = mid -1;
               }
           }else {
               if(array[mid]<target){
                   end = mid -1;
               }else {
                   start = mid + 1;
               }
           }
       }

       return start;
   }


   //greatest no less than or equal to target in an array
   public static int floorOfNumber(int[] ary, int target){
        int start =0;
        int end = ary.length -1;

        boolean isAsc = ary[start]<ary[end];
        while (start<=end){
            int mid = start + (end - start)/2;
            if(ary[mid]==target){
                return mid;
            }
            if(isAsc){
            if(ary[mid]<target) start = mid +1;
            else end = mid -1;
            }else{
                if(ary[mid]<target) end = mid -1;
                else start = mid + 1;
            }

        }
       return end;
   }
    //smallest letter which is > target letter
   public static int smallestLetter(char[] cry, char target){

        int start = 0;
        int end = cry.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (cry[mid] > target) {
                end = mid - 1;
//                start = mid +1;
            } else {
                start = mid + 1;
//                end = mid - 1;
            }
        }
       System.out.println(" start "+ start+"  length "+cry.length);
       System.out.println("modulo "+start % cry.length);
        return start % cry.length;
   }

   //fetch first and last element of target value
   public static int[] fstAndLst(int[] array, int trgt){
        //{2,3,10,10,10,10,10,33}
        int[] ans ={-1,-1};
        ans[0] = search(array,trgt,true);
        if (ans[0] != -1){
           ans[1] = search(array, trgt, false);
       }
       return ans;
    }

    public static int search(int[] ary,int target, boolean findStartIndex){
        //{2,3,10,10,10,10,10,33}
        int ans = -1;
        int start = 0;
        int end = ary.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (ary[mid] > target) {
                end = mid - 1;
            } else if(ary[mid] <target) {
                start = mid + 1;
            }else{
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
