//3. Create a class with a constructor that takes a String argument. During construction,
// print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array.
// When you run the program, notice whether the initialization messages from the constructor calls are printed.


package assignment_6.stringConstructor;

public class Main {
    public static void main(String[] args) {
        MyClass[] array=new MyClass[2];
        array[0]=new MyClass("hello");
    }
}
