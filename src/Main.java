public class Main {
    private static final CustomersArray customersArray = new CustomersArray();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            customersArray.saveCustomer(RandomCustomer.getCustomer());
        }

        //customersArray.getCustomersUsedInnerCityMoreThan(9000);
        //customersArray.getCustomersUsedlongDistanceCall();
        //customersArray.sortCustomerByName();
        //customersArray.getFirstTenCustomersWithBiggestTraffic();


    }
}
