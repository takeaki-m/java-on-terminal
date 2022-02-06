import mypackage.*;

public class HelloWorld {
    public static void main(String[] args) {
        Person p = new Person(10, "Ted");
        System.out.println("Hello, World");
        p.printAge();
        p.printAge();
    }
}
