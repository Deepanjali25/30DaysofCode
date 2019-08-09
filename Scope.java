package Hackerrank.ThirtyDaysofCode;
import java.util.*;
class Difference {
    private int[] elements;
    public int maximumDifference;
    public Difference(int[] arr) {
        this.elements = arr;
    }
    public void computeDifference() {
        bubbleSort(elements);
        maximumDifference = Math.abs(elements[0] - elements[(elements.length - 1)]);
    }
    public static void bubbleSort(int arr[]) {
        for (int x = 0; x < arr.length-1; x++) {
            for(int y = 0; y < arr.length - x - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
    }
}
public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}