package dsa;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {{2,3,4},
                {3,5,7,8},
                {100,200,300}
        };
        System.out.println(array.length);
        System.out.println("is element is present in array "+srch2dElements(array,3));
    }

    private static boolean srch2dElements(int[][] ary, int target) {
        if(ary.length!=0){
//            for (int i =0;i<ary.length;i++){
//                for (int i1 =0;i1<ary[i].length;i1++){
//                    if(ary[i][i1]==target){
//                        return true;
//                    }
//                }
//            }
            for(int[] i : ary){
                for (int i1 : i){
                    if(i1==target){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
