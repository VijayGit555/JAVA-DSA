package dsa;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to findout Amstrong or Not");
        int a = sc.nextInt();
        int c = amstrong(a);
        System.out.println(" Is the Number Amstrong "+(a==c));
        Calendar currentCal = Calendar.getInstance();
        isInvalidDateRange(currentCal.getTime());
    }
    public static int  amstrong(int n){
        int sum =0;
        while (n>0){
            int rem = n %10;
            n = n/10;
            int result = rem*rem*rem;
            sum+= result;
        }
        System.out.println(" Sum "+ sum);
        return sum;

    }
    private static void isInvalidDateRange(final Date incomingDate){
        boolean invalidDateRange = true;
        Calendar currentCal = Calendar.getInstance();
        Calendar past3Years = Calendar.getInstance();
        past3Years.add(Calendar.MONTH, -36);
        past3Years.add(Calendar.DAY_OF_MONTH, -1);
        currentCal.add(Calendar.DAY_OF_MONTH, currentCal.getActualMaximum(Calendar.DATE)-currentCal.get(Calendar.DATE));
        System.out.println(" Current Date "+currentCal.getTime() +
                " Past 3 Days "+past3Years.getTime()+
                " incoming date "+ incomingDate);
        if(incomingDate.before(currentCal.getTime())&&incomingDate.after(past3Years.getTime())){
            invalidDateRange=false;
        }
        System.out.println(invalidDateRange);
    }
}
