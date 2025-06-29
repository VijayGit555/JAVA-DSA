package sorting;

import java.util.Arrays;

public class SortingAlgorithm {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        bubble(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arry) {
        boolean swapped = false;
        //run loop for n-1 times
        for (int i = 0; i < arry.length; i++) {
            for (int j = 1; j < arry.length - i; j++) {
                if (arry[j] < arry[j - 1]) {
                    swap(arry,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void selectionSort(int[] arr){
        //find the maximun index item in array and place in the correct index.
        for (int i=0;i<arr.length;i++){

            int lastIndex = arr.length - i-1;
            int max = getMaxItem(arr,0,lastIndex);
            swap(arr,max,lastIndex);

        }
    }

    private static int getMaxItem(int[] arr, int start, int lastIndex) {
        int max =start;
        for (int i=start;i<=lastIndex;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    public static void swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void insertionSort(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            for (int j = i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
public static void cyclicSort(int[] arr){
        int i =0;
        while (i < arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

}
}
