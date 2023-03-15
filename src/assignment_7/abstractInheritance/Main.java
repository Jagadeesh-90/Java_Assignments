//1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class,
// provide methods that are common to all Rodents, and override these in the derived classes to perform
// different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents,
// and call your base-class methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should
// have default constructors that print a message about that class.


package assignment_7.abstractInheritance;

public class Main {
    public static void main(String[] args) {
        BaseClass[] rodents=new BaseClass[3];
        rodents[0]=new Mouse();
        rodents[1]=new Gerbil();
        rodents[2]=new Hamster();
        for (BaseClass rodent:rodents){
            rodent.eat();
            rodent.run();
            rodent.sleep();
        }
//        Mouse m= new Mouse();
//        m.sleep();
    }
}
