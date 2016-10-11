/**
 * Created by zach on 10/11/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        int num = 12345;
        // 54321

        // manually reverse a string
        String numStr = String.valueOf(num);
        String numStr2 = "";
        for (int i = numStr.length()-1; i >= 0; i--) {
            numStr2 += numStr.charAt(i);
        }
        int num2 = Integer.valueOf(numStr2);
        System.out.println(num2);

        // use StringBuilder
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        num2 = Integer.valueOf(sb.toString());
        System.out.println(num2);

        // use math
        num2 = 0;
        while (num != 0) {
            num2 *= 10;
            num2 += num % 10;
            num /= 10;
        }
        System.out.println(num2);
    }
}
