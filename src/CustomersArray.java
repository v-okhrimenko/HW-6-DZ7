import java.util.Arrays;
import java.util.Objects;

public class CustomersArray implements PhoneMetods, Cloneable {
    private final static Phone[] customersArray = new Phone[10000];
    private static int id = 0;

    public void saveCustomer(Phone phone) {
        if (Objects.nonNull(phone)) {
            if (Objects.nonNull(phone.getSurname())) {
                phone.setId(id);
                customersArray[id] = phone;
                id++;
            } else {
                System.out.println("Не возможно сохранить пустой обьект");
            }
        } else {
            System.out.println("Не возможно сохранить NULL");
        }

    }

    @Override
    public void getCustomersUsedNoLocalCall() {
        Phone[] temp = getCustomersArrayWithoutNull();
        System.out.println("Cведения об абонентах, которые пользовались междугородной связью: ");
        for (int i = 0; i < id; i++) {
            if (Objects.nonNull(temp[i])) {
                if (temp[i].getTimeNoLocalCall() > 0) {
                    System.out.println(temp[i]);
                    System.out.println("________________________");
                }
            }
        }
    }

    @Override
    public void getCustomersUsedNoLocalCallMoreThan(int time) {
        System.out.println("Cведения об абонентах, у которых время внутригородских разговоров превышает " + time + ":");
        for (Phone phoneCustomers : getCustomersArrayWithoutNull()) {
            if (Objects.nonNull(phoneCustomers)) {
                if (phoneCustomers.getTimeLocalCall() > time) {
                    System.out.println(phoneCustomers);
                    System.out.println("________________________");
                }
            }
        }
    }

    @Override
    public void sortCustomerByName() {
        System.out.println("Cведения об абонентах в алфавитном порядке (по фамилии): ");
        Phone[] sortedCustomersByName = getCustomersArrayWithoutNull();
        Arrays.sort(sortedCustomersByName);
        for (Phone phone : sortedCustomersByName) {
            System.out.println(phone);
            System.out.println("________________________");
        }
    }

    private Phone[] getCustomersArrayWithoutNull() {
        Phone[] noNullArray = new Phone[id];
        if (id >= 0) {
            System.arraycopy(customersArray, 0, noNullArray, 0, id);
        }
        return noNullArray;
    }

}
