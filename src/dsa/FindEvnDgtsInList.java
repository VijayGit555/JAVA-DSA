package dsa;

public class FindEvnDgtsInList {
    public static void main(String[] args) {
        int[][] array = {{120,64,23,22,2,4},{2,10,11},{400}};

//        fetchEvenNumberOfDigitsInArray(array);
//        System.out.println(maximunWealth(array));
        maximunWealth(array);
    }


     static void fetchEvenNumberOfDigitsInArray(int[] num) {

    }

    static int noOfDigits(int[] num){
        int count =0;
        for (int i : num) {
            if (even(i)) count++;

        }
        return count;
    }

    static boolean even(int num){
    return num % 2==0;
    }

    static void maximunWealth(int[][] ary){
        int max = Integer.MIN_VALUE;
        for (int[] i : ary){
            int maxwealth=0;
            for(int ij : i ){
                maxwealth+= ij;
            }
            if (max < maxwealth){
                max = maxwealth;
            }

        }
        System.out.println("Maximum Wealth in 2d Array "+ max);
    }

}
