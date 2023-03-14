package assignment_11;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = keyboard.nextLine();
        CharacterCount object = new CharacterCount();
        object.characterCount(fileName);
    }
}
