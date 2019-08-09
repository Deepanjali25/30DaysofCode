package Hackerrank.ThirtyDaysofCode;

import java.util.*;
class Person1 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    Person1(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    public void printPerson1() {
        System.out.println("Name: " + lastName + ", " + firstName + 	"\nID: " + idNumber);
    }
}
class Student extends Person1 {
    private int[] scores;
    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.scores=scores;
    }
    char calculate() {
        int i,sum=0,avg;
        char grade;
        for(i=0; i<scores.length; i++)
            sum += scores[i];
        avg = sum / scores.length;
        if (avg <= 100 && avg >= 90)
            grade = 'O';
        else if (avg<90 && avg>=80)
            grade = 'E';
        else if (avg<80 && avg>=70)
            grade = 'A';
        else if (avg<70 && avg>=55)
            grade = 'P';
        else if (avg<55 && avg>=40)
            grade = 'D';
        else
            grade = 'T';
        return grade;
    }
}
class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] scores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            scores[i] = scan.nextInt();
        }
        scan.close();
        Student s = new Student(firstName, lastName, id, scores);
        s.printPerson1();
        System.out.println("Grade: " + s.calculate() );
    }
}