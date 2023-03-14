package assignment_7.classInheritance;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycle=new Cycle[3];
        cycle[0]=new Unicycle();
        cycle[1]=new Bicycle();
        cycle[2]=new Tricycle();
        for(Cycle cycle1:cycle){
          //  cycle1.balance();
        }
    }
}
