package assignment_5.main;

import assignment_5.data.Variables;
import assignment_5.singleton.StaticMemeber;

public class Main {
    public static void main(String[] args) {
        Variables myObj=new Variables();
        myObj.printMembers();
        myObj.printLocalMember();
      //  StaticMember obj=new StaticMember("hello");
       StaticMemeber obj=StaticMemeber.initializeString("Hello");
        obj.printString();
    }
}
