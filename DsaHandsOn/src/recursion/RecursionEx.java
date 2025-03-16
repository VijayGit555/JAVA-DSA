package recursion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class RecursionEx {

    public static void main(String[] args) throws ParseException {
//        printNum(1);
//        System.out.println(fibbonaci(4));
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(0,0,1,0,0,0);
        System.out.println(cal.getTime());
    }

    static void printNum(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    static int fibbonaci(int n) {

        if (n < 2) {
            return n;
        }
        return fibbonaci(n - 1) + fibbonaci(n - 2);
    }

}
