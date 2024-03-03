package SingletonDesignPattern;

public class Main {
    public static void main (String[] args) {
        MyClass myClass = MyClass.getInstance();
        myClass.name = "Class";

        System.out.println(myClass);

    }
}
