public class Main {
    private static final CustomersArray customersArray = new CustomersArray();

    public static void main(String[] args) throws CloneNotSupportedException {

//        Phone ph1 = new Phone("Бойко", "Vasiliy", "Petrovych",
//                new Phone.Address("u", "kiev", "Avenue", "13f", "123"),
//                "380634569707", "1212121", 34212, 121, 77,
//                0, 12314);
//
//        Phone ph2 = new Phone("Асад", "Alex", "Nikolayevych",
//                new Phone.Address("Ukraine", "Lviv", "Khmelnickogo", "1a", "3"),
//                "380934567832", "1212121", 121212, 121, 10,
//                1, 1231);
//
//        Phone ph3 = new Phone("Дмитрук", "Alex", "Nikolayevych",
//                new Phone.Address("Ukraine", "Lviv", "Khmelnickogo", "1a", "3"),
//                "380934567832", "1212121", 121212, 121, 1,
//                0, 1231);
//
//
//        Phone ph = new Phone("Вилкул", "Василий", "Александрович",
//                new Phone.Address("Uk", "Kiev", "Labooda", "10a", "122"), "1212121212",
//                "12345", 1222, 32323, 122, 12, 22);
//
//        customersArray.saveCustomer(ph1);
//        customersArray.saveCustomer(ph2);
//        customersArray.saveCustomer(ph3);
//        customersArray.saveCustomer(ph);
//        Phone p = new Phone();
//        customersArray.saveCustomer(p);

        for (int i = 0; i < 100; i++) {
            customersArray.saveCustomer(RandomCustomer.getCustomer());
        }

        PhoneMetods pm = new CustomersArray();
        pm.sortCustomerByName();
        //pm.getCustomersUsedInnerCityMoreThan(50000);
        //pm.getCustomersWithBiggestTraffic();

    }
}
