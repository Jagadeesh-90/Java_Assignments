package assignment_5.singleton;

public class StaticMember {
    private  String name;
    public static StaticMember initializeString(String str){

        StaticMember obj= new StaticMember();
        obj.name=str;
        return obj;
    }
    public void printString(){

        System.out.println(name);
    }

}
