package assignment_9;

import java.util.Scanner;
import java.util.regex.Pattern;

import static assignment_9.MatchSentence.sentenceMethod;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String sentence=keyboard.nextLine();
        Pattern pattern=Pattern.compile("^[A-Z].*$");
        sentenceMethod(pattern,sentence);
    }

}
