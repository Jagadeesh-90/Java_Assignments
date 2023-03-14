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
