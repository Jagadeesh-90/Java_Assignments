package assiignment_4;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        KycDateRange kycRange = new KycDateRange();
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0){
            String signupDateStr = sc.next();
            String currentDateStr = sc.next();
            LocalDate signupDate = LocalDate.parse(signupDateStr, formatter);
            LocalDate currentDate = LocalDate.parse(currentDateStr, formatter);
            kycRange.getRange(signupDate,currentDate);
        }
    }
}
