package assignment_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StringLengthLessThanFive, OddNumberException, NumberEqualToZero {
        Scanner keyboard=new Scanner(System.in);
        String name=keyboard.nextLine();
        int number1=keyboard.nextInt();
        int number2=keyboard.nextInt();
        ExceptionDemo d=new ExceptionDemo();
        d.checkExceptions(name,number1,number2);
    }
}
