import java.util.ArrayList;
import java.util.Objects;

public class CustomersArray implements PhoneMetods {
    private final static ArrayList<Phone> customersArray = new ArrayList<>();
    private static int count;

    public void saveCustomer(Phone phone) {
        phone.setId(count);
        customersArray.add(phone);
        count++;
    }

    @Override
    public ArrayList<Phone> getCustomerUseNoLocalCall() {
        ArrayList<Phone> selectedCustomers = new ArrayList<>();
        System.out.println("Cведения об абонентах, которые пользовались междугородной связью: ");
        for (int i = 0; i < count; i++) {
            if (Objects.nonNull(customersArray.get(i))) {
                if (customersArray.get(i).getTimeNoLocalCall() <= 0) {
                    selectedCustomers.add(customersArray.get(i));
                    System.out.println(customersArray.get(i));
                    System.out.println("________________________");
                }
            }
        }
        return selectedCustomers;
    }

    @Override
    public ArrayList<Phone> getCustomerMoreLocalCall(int time) {
        ArrayList<Phone> selectedCustomers = new ArrayList<>();
        System.out.println("сведения об абонентах, у которых время внутригородских разговоров превышает " + time + ":");
        for (Phone phoneCustomers : customersArray) {
            if (Objects.nonNull(phoneCustomers)) {
                if (phoneCustomers.getTimeLocalCall() > time) {
                    selectedCustomers.add(phoneCustomers);
                    System.out.println(phoneCustomers);
                    System.out.println("________________________");
                }
            }
        }
        return selectedCustomers;
    }

    @Override
    public ArrayList<Phone> sortCustomerByName() {

        return new ArrayList<>();
    }

}
