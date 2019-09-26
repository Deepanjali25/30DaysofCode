package Hackerrank.ThirtyDaysofCode;
import java.util.Scanner;
public class StringToIntegerExceptions {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            try {
                int len=Integer.parseInt(S);
                System.out.println(len);
            }
            catch(Exception e) {
                System.out.println("Bad String");
            }
        }
}
