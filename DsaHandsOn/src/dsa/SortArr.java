package dsa;

import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int[] arr = {1,800,70,50,80,2};
        int size = arr.length;
        System.out.println(size);
        System.out.println("Before Sort " + Arrays.toString(arr));
//        quickSort(arr,0,arr.length-1);
        mergeSort(arr,0,arr.length-1);
//        insertionSort(arr);
        System.out.println(" After Sort " + Arrays.toString(arr));
//        mergeSort(arr);
    }

    public static int[] bubbleSort(int[] arr, int size) {
        int k =0;
        for (int i = 0; i < size; i++) {
            k++;
            for (int j = 0; j < size-i; j++) {
                k++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Inside for " + k);
        return arr;
    }

    public static int[] selectionSort(int[] array) {
        int minIndex = -1;
        int size = array.length;
        int k =0;
        for (int i = 0; i < size - 1; i++) {
            k++;
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                k++;
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                    System.out.println(" in min " + j);
                }
            }
            System.out.println(" Min Value found " + array[minIndex] + " " + array[i]);
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println(" Loop Count "+ k);
        return array;
    }

    public static int[] insertionSort(int[] array){
       for (int i =1;i<array.length;i++){
            int j = i -1;
            int key = array[i];
           System.out.println(i+"   "+j);
            while (j>=0 && array[j]>key){
                array[j+1] = array[j];
                j= j-1;
            }
           array[j+1] = key;
       }
        return array;
    }

    public static void quickSort(int[] array, int low, int high){
        System.out.println(" low "+low +" high "+high);
        if(low<high){
            int pi = partition(array,low,high);
            System.out.println("1. high "+high);
            quickSort(array,low,pi-1);
            System.out.println("2. high "+high);
            quickSort(array,pi+1,high);

        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low-1;
        for (int j =low;j<high;j++){
            if (array[j] < pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;

            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        System.out.println(" After partition "+Arrays.toString(array));
        return i+1;
    }

    public static void mergeSort(int[] arr,int l,int r){
        System.out.println("Before starting if l="+l+" r="+ r);
        int mid = (l + r)/2;
        if(l<r){
            System.out.println("1. l="+l+" mid="+mid+" r="+ r);
            mergeSort(arr,l,mid);
            System.out.println(("2. l="+l+" mid="+mid+" r="+ r));
            mergeSort(arr,mid+1,r);
            System.out.println("at end "+Arrays.toString(arr));
            merge(arr,l,r,mid);
        }
    }

    private static void merge(int[] arr, int l, int r, int mid) {
        //0  5 10
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int x =0; x <n1;x++){
            lArr[x] = arr[l+x];
        }

        for (int x =0; x <n2;x++){
            rArr[x] = arr[mid+1+x];
        }
        int i =0;
        int j =0;
        int k =l;

        while (i <n1 && j < n2){
            if (lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }else {
                arr[k] = rArr[j];
                j++;
            }
            k++;

        }
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }


}
