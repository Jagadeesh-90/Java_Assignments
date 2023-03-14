package assignment_7.innerClass;

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        OuterClass.Inner inner = outer.new Inner(20);
        inner.printInnerData();
        outer.printOuterData();
        SubOuterClass subclass = new SubOuterClass(30);
        SubOuterClass.SubclassInner subclassInner = subclass.new SubclassInner(40);
        subclassInner.printData();
    }
}
