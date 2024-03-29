package Hackerrank.ThirtyDaysofCode;
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
class LinkedList {
    public static Node insert(Node head,int data) {
        Node current=head;
        Node temp=null;
        if(current==null) {
            temp=new Node(data);
            current=temp;
            return temp;
        }
        else {
            Node temp1=current;
            while(current.next!=null) {
                current=current.next;
            }
            current.next= new Node(data);
            current= current.next;
            current.data =data;
            return temp1;
        }
    }
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}