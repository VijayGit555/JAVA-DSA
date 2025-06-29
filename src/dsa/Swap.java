package dsa;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr ={8,72,45,63,10};
        System.out.println(Arrays.toString(swap(arr, 0,3)));
        System.out.println(maxInArray(arr));
        int start =0;
        int end = arr.length-1;
        while (end >start){
            System.out.println("inside while");
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int[] swap(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    return arr;
    }

    static int maxInArray(int[] arr){
        int x = arr[0];
        for(int i =0;i<arr.length;i++){
           if(arr[i]>x){
               x= arr[i];
           }
        }
        return x;
    }
}
