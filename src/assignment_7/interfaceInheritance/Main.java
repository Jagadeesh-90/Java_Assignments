//3. Create three interfaces, each with two methods. Inherit a new interface that combines the three,
// adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class.
// Now write four methods, each of which takes one of the four interfaces as an argument. In main( ),
// create an object of your class and pass it to each of the methods.


package assignment_7.interfaceInheritance;

public class Main {
    public static void main(String[] args) {
        CallingMethods object=new CallingMethods();
        Implementation implement=new Implementation();
        object.methodA(implement);
        object.methodB(implement);
        object.methodC(implement);
        object.methodD(implement);
    }
}
