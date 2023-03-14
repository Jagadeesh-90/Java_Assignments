package assignment_10;

public class Main {
    public static void main(String[] args){

        SList<String> list=new SList<>();
        SListIterator<String> it=new SListIterator<>(list);
        it.add("Hello");
        System.out.println(list);
        it.add("Pj");
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.add("java");
        it.add("Bye");
        it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());

    }
}
