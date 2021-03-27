import java.util.Arrays;
import java.util.concurrent.Phaser;

public class Main {
    private static final CustomersArray customersArray = new CustomersArray();

    public static void main(String[] args) {

        Phone ph1 = new Phone("Ivanov", "Vasiliy", "Petrovych",
                new Address("u", "kiev", "Avenue", "13f", 123),
                "380634569707", 1212121, 34212, 121, 77,
                0, 12314);

        Phone ph2 = new Phone("Petrov", "Alex", "Nikolayevych",
                new Address("Ukraine", "Lviv", "Khmelnickogo", "1a", 3),
                "380934567832", 1212121, 121212, 121, 10,
                1, 1231);

        Phone ph3 = new Phone("______", "Alex", "Nikolayevych",
                new Address("Ukraine", "Lviv", "Khmelnickogo", "1a", 3),
                "380934567832", 1212121, 121212, 121, 1,
                0, 1231);


        customersArray.saveCustomer(ph1);
        customersArray.saveCustomer(ph2);
        customersArray.saveCustomer(ph3);


        System.out.println(ph3);


        //PhoneMetods pm = new CustomersArray();
        //pm.getCustomerUseNoLocalCall();
        //pm.getCustomerMoreLocalCall(2);
        //pm.sortCustomerByName();

    }
}
