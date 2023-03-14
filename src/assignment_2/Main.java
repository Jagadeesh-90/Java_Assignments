package assignment_2;

import java.util.Scanner;

import static assignment_2.AlphabetChecker.containsAllLetters;


public class Main {
    public static void main(String[] args) {
        String input;
        Scanner keyBoard=new Scanner(System.in);
        input=keyBoard.nextLine();
        System.out.println(input + "  contains all letters  " +containsAllLetters(input));
    }

}
