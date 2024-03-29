package Hackerrank.ThirtyDaysofCode;

// This class defines an integer stack that can hold 10 values.
class Stack {
    int stck[] = new int[10];
    int tos;
    // Initialize top-of-stack
    Stack() {
        tos = -1;
    }
    // Push an item onto the stack
    void push(int item) {
        if(tos==9)
            System.out.println("Hackerrank.ThirtyDaysofCode.Stack is full.");
        else
            stck[++tos] = item;
    }
    // Pop an item from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Hackerrank.ThirtyDaysofCode.Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}