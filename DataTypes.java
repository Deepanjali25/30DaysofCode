package Hackerrank.ThirtyDaysofCode;

import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        System.out.println(a+i);
        System.out.println(b+d);
        System.out.println(s + c);
        scan.close();
    }
}