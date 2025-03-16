package solveQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingQuestions {

    public static void main(String[] args) {
        int[] a = {1,2,0};
//        missingNumber(a);
//        System.out.println(missingNumber(a));
//        System.out.println(allMissingNos(a));
//        System.out.println(dupNo(a));
//        System.out.println(twoDupNo(a));
//        System.out.println(Arrays.toString(a));
//        System.out.println(setMismatch(a));
        System.out.println(misgPtvNum(a));
    }

    public static int missingNumber(int[] arr){
        int i =0;
        while (i<arr.length){
            int correctIndex = arr[i];
            if(arr[i] == arr.length || arr[i] == arr[correctIndex]){
                i++;
            }else{
                swap(arr,i,correctIndex);
            }

        }

        for(int missingIndex =0; missingIndex<arr.length;missingIndex++){
            if(arr[missingIndex] != missingIndex){
                return missingIndex;
            }
        }
        return -1;
    }

    public static void swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static List allMissingNos(int[] arr){
        //2,1
        int i =0;
        while (i<arr.length){
            int presentIndex = arr[i];
            int actualIndex = arr[i] -1;
            if(presentIndex!=arr[actualIndex]){
                swap(arr,i,actualIndex);
            }else{
                i++;
            }
        }
        List<Integer> l = new ArrayList<>();

        for (int missVal=0;missVal<arr.length;missVal++){
            if(arr[missVal] != missVal+1){
                l.add(missVal+1);
            }
        }
        return l;

    }
    public static int dupNo(int[] arr){
        int i =0;
        while (i<arr.length){
            if(arr[i] != i + 1) {
                int presentIndex = arr[i];
                if (presentIndex != arr[presentIndex - 1]) {
                    swap(arr, i, presentIndex - 1);
                } else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    public static List twoDupNo(int[] arr){
        int i =0;
        List l = new ArrayList();
        while (i<arr.length){
            if(arr[i] != i + 1) {
                int presentIndex = arr[i];
                if (presentIndex != arr[presentIndex - 1]) {
                    swap(arr, i, presentIndex - 1);
                } else {
                    if(!l.contains(arr[i])) {
                        l.add(arr[i]);
                    }
                    i++;
                }
            }else {
                i++;
            }
        }
        return l;
    }


    public static List setMismatch(int[] arr){
    List l = new ArrayList();
    int i =0;
    while (i<arr.length){

        if(arr[i]!= i+1){

            if(arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else {
                l.add(arr[i]);
                l.add(arr[i] + 1);
                return l;
            }
        }else {
            i++;
        }

    }
    return l;
    }

    public static int misgPtvNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i]<=arr.length && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
}
