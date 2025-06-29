package dsa;

public class InfiniteArray {
    public static void main(String[] args) {
    //fetch position of the element in an infinite array
        int[] ar = {23,57,89,70,100,200,500,900};
        System.out.println(" The Ans "+ searchInfiniteArray(ar,900));
    }
    public static int binarySearch(int[] cry, int target,int start, int end) {
        int a = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (cry[mid] > target) {
                end = mid - 1;
            } else if(cry[mid]<target){
                start = mid + 1;
            }else {
                return  mid;
            }
        }
        return a;
    }

    public static int searchInfiniteArray(int[] ary, int target){
        int start =0;
        int end =1;
        while(ary[end]<target){
            int newStart = end +1;
            end = end + (end - start +1)*2;
            start = newStart;
            System.out.println("start "+start+"  end "+ end);
        }

        return binarySearch(ary,target,start,end);
    }



}
