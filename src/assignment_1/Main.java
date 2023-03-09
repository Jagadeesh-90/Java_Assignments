package assignment_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter regular expression:");
        String regex = scanner.nextLine();
        FileSearcher searcher = new FileSearcher();
        searcher.search(regex);
    }
}
