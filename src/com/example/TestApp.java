import com.example.models.*;

public class TestApp {
    public static void main(String[] args) {
        Person p = new Person(20, "John Doe");
        p.printName();
        p.printAge();
    }
}
