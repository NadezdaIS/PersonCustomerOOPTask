
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John Smith", "john.smith@example.com", "1234567890");
        Customer customer1 = new Customer("Jane Doe", "jane.doe@example.com", "987654321",
                20.40, new Date());
        System.out.println(person1.sayHello());
        System.out.println(customer1.sayHello());
        System.out.println(person1.introduce());
        System.out.println(customer1.introduce());
    }

}
