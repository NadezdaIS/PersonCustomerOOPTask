import java.util.Date;

// Inheritance
public class Customer extends Person {

    private double balance;
    private Date registrationDate;

    public Customer(String name, String email, String phoneNumber, double balance, Date registrationDate){
        super(name, email, phoneNumber);
        this.balance = balance;
        this.registrationDate = registrationDate;
    }

    @Override
    public String sayHello() {
        return "Hello customer!";
    }
}

