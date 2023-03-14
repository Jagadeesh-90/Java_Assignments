package assignment_6.vampire;

import assignment_6.vampire.VampireNumber;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        int count=0;
        int number=10;
        ArrayList<Integer> vampireNumbers = new ArrayList<>();
        VampireNumber vampire= new VampireNumber();
        while(count<100){
            if(vampire.isVampireNumber(number)){
                count++;
                vampireNumbers.add(number);
            }
            number++;
        }
        System.out.println("First 100 vampire numbers are..");
        System.out.println(vampireNumbers);
    }
}
