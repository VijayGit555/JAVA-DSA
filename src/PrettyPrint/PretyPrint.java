package PrettyPrint;

public class PretyPrint {

    public static void main(String[] args) {
        float a = 2.156f;
        System.out.printf("float value is: %.2f ", a);
        System.out.printf("Pie value: %.4f", Math.PI);
        String series = "";
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            series = series + c;
        }
        System.out.println(series);

    }
}
