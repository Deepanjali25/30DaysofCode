package Hackerrank.ThirtyDaysofCode;

import java.util.Scanner;
abstract class Book1 {
    String title;
    String author;
    Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }
    abstract void display();
}
class MyBook extends Book1 {
    int price;
    public MyBook(String title, String author,int price) {
        super(title,author);
        this.price= price;
    }
    public void display() {
        System.out.println("Title: " +title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();
        Book1 book = new MyBook(title, author, price);
        book.display();
    }
}
