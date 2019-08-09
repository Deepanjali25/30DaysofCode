package Hackerrank.ThirtyDaysofCode;

import java.util.*;
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0,min=0;
        while(n>0) {
            if(n%2==1) {
                count++;
                if(count>=min) {
                    min=count;
                }
            }
            else {
                count=0;
            }
            n=n/2;
        }
        System.out.println(min);
    }
}
