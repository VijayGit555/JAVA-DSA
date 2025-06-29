package dsa;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        String s = "Vijay";
        Scanner in = new Scanner(System.in);
//        System.out.println(s.length());
      System.out.println("Enter the String to find "+searchString(s,'v'));
    }

    private static boolean searchString(String string , char target) {
    if (string.isEmpty()) return false;
//    for (int i =0;i<string.length()-1;i++) if (string.charAt(i) == target) return true;
        for(char c :string.toCharArray())  if(c == target) return true;
    ;return false;
    }

}
