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
