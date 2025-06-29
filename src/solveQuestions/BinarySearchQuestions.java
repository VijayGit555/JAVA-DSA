package solveQuestions;

import java.util.Arrays;

public class BinarySearchQuestions {

    public static void main(String[] args) {
        System.out.println("Inside ");
        int[] ascArr = {7,2,5,10,8};
        int[] dscArr = {40, 35, 20, 15, 50};
        char[] a = {'a', 'c', 'd', 'f', 'g'};
//        System.out.println(floorOfNo(arr,19));
//        System.out.println(smlstChInAry(a, 'g'));
//        System.out.println(Arrays.toString(fstLstNo(ascArr,1)));
//        System.out.println(binarySearch(ascArr, 10));
//        System.out.println(findInInfiniteArray(ascArr,100));
//        System.out.println(peakInMountainArray(ascArr));
//        System.out.println(searchInMountArray(ascArr,4));
//        System.out.println(rotatedBinarySearchDplts(ascArr,14));
//        System.out.println(roatationCountOfArray(ascArr));
//        System.out.println(splitArrayLarSum(ascArr,2));
        System.out.println(splitArrayLarSum(ascArr,3));
    }




    //Ceiling of a Number
    //Smallest Number in a array >= target
    public static int ceilingOfNo(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        if (arr[end] < target) {
            return ans;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {

                return mid;
            }


            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        System.out.println("start " + start + "  end " + end);
        return start;
    }

    //Binary Search
    public static int binarySearch(int[] arr, int tgt) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        boolean asc = arr[start] < arr[end];
//        if
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == tgt) {
                return mid;
            }

            if (arr[mid] > tgt) if (asc) end = mid - 1;
            else start = mid + 1;

            else if (asc) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }
//45,10,9,2

    //floor of a Number
    //greatest Number in a  array<= target
    public static int floorOfNo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        if (arr[end] < target) {
            return ans;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("start " + start + "  end " + end);
        return end;
    }

    //Return Smallest character in Array > target
    public static char smlstChInAry(char[] c, char target) {
        //{'a','c','d','f','g'}   target=''f
        int start = 0;
        int end = c.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (c[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return c[start % c.length];
    }

    //starting point and ending point of a TARGET in Array
    public static int[] fstLstNo(int[] arry, int target) {
        int[] ans = new int[2];
        int ans1 = binarySearch(arry, target);
        ans[0] = binarySearch(arry, target, 0, ans1 - 1);
        if (ans[0] != -1) {
            ans[1] = binarySearch(arry, target, ans1, arry.length - 1);
        }


//        return {1,2};
        return ans;
    }

    public static int binarySearch(int[] arr, int tgt, int start, int end) {
        int ans = -1;
        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == tgt) {
                ans = mid;
            }

            if (arr[mid] > tgt) {
                if (asc) end = mid - 1;
                else start = mid + 1;
            } else {
                if (asc) start = mid + 1;
                else end = mid - 1;
            }
        }
        return ans;
    }

    public static int findInInfiniteArray(int[] arry, int tr) {
        int start = 0;
        int end = 1;
        while (tr > arry[end]) {
            System.out.println(" start " + start + "  end " + end);
            int temp = start;


            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arry, tr, start, end);
    }


    public static int peakInMountainArray(int[] arr) {
        int ans = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int searchInMountArray(int[] arr, int tr) {
        int peak = peakInMountainArray(arr);
        if (peak == tr) return peak;
        int a = binarySearch(arr, tr, 0, peak);
        if (a == -1) {
            a = binarySearch(arr, tr, peak + 1, arr.length - 1);
        }
        return a;
    }

    public static int rotatedBinarySearch(int[] arr, int tr) {
        int pIdx = pivot(arr);
        if (pIdx == -1) {
            return binarySearch(arr, tr, 0, arr.length - 1);
        }
        if (arr[pIdx] == tr) return pIdx;

        if (tr >= arr[0]) {
            return binarySearch(arr, tr, 0, pIdx - 1);
        } else {
            return binarySearch(arr, tr, pIdx + 1, arr.length - 1);
        }

    }

    private static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }


        }
        System.out.println("start " + start + " end " + end);
        return -1;
    }

    public static int fndPvtDupl(int[] arr) {
        //2,9,2,2,2,2,2
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
//            } else if (arr[start] < arr[mid] || ((arr[start] == arr[mid]) && arr[mid] > arr[end])) {
            } else if(arr[start] > arr[mid]){
                end = mid - 1;
//                start = mid +1;
            } else {
                start = mid + 1;
//                end = mid -1;
            }
        }
        return -1;
    }

    public static int rotatedBinarySearchDplts(int[] arr, int tr) {
        int pIdx = fndPvtDupl(arr);
        if (pIdx == -1) {
            return binarySearch(arr, tr, 0, arr.length - 1);
        }
        if (arr[pIdx] == tr) return pIdx;

        if (tr >= arr[0]) {
            return binarySearch(arr, tr, 0, pIdx - 1);
        } else {
            return binarySearch(arr, tr, pIdx + 1, arr.length - 1);
        }

    }

    static int roatationCountOfArray(int[] arr){
        int count = pivot(arr);
        if(count !=-1) return count+1;
        return -1;
    }

    private static int splitArrayLarSum(int[] ascArr, int m) {

        int start = 0;
        int end =0;

        for(int i :ascArr){
            start = Math.max(start,i);
            end += i;
        }
        while (start<end){
            int mid= start + (end - start)/2;
            int sum=0;
            int splitCount=1;
            for(int i : ascArr){
                if(sum + i > mid){
                    sum = i;
                    splitCount++;
                }else{
                    sum += i;
                }
            }
            if(splitCount <= m) {
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return end;
    }

}
