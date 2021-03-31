import java.util.Arrays;
import java.util.Objects;

public class CustomersArray implements PhoneMetods, Cloneable {
    private final static Phone[] customersArray = new Phone[10000];
    private static int id = 0;

    public void saveCustomer(Phone phone) {
        if (id == 10000) {
            System.out.println("Невозможно добвать " + phone.getSurname() + " " +
                    phone.getFirstName() + " " + phone.getPatronymic() + ". Массив полон!");
            return;
        }
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
    public void getCustomersUsedlongDistanceCall() {
        Phone[] temp = getCloneCustomersArrayWithoutNull();

        System.out.println("\nCведения об абонентах, которые пользовались междугородной связью: \n");
        for (int i = 0; i < id; i++) {
            if (Objects.nonNull(temp[i])) {
                if (temp[i].getLongDistanceCall() > 0) {
                    System.out.println(temp[i]);
                }
            }
        }
    }

    @Override
    public void getCustomersUsedInnerCityMoreThan(int time) {
        System.out.println("\nCведения об абонентах, у которых время внутригородских разговоров превышает " + time + ":\n");
        for (Phone phoneCustomers : getCloneCustomersArrayWithoutNull()) {
            if (Objects.nonNull(phoneCustomers)) {
                if (phoneCustomers.getInnerCityCall() > time) {
                    System.out.println(phoneCustomers);
                    System.out.println("________________________");
                }
            }
        }
    }

    @Override
    public void sortCustomerByName() {
        System.out.println("\nCведения об абонентах в алфавитном порядке (по фамилии): \n");
        Phone[] sortedCustomersByName = getCloneCustomersArrayWithoutNull();
        Arrays.sort(sortedCustomersByName);
        for (Phone phone : sortedCustomersByName) {
            System.out.println(phone);
        }
    }

    private Phone[] getCloneCustomersArrayWithoutNull() {
        Phone[] noNullArray = new Phone[id];
        if (id >= 0) {
            for (int i = 0; i < id; i++) {
                if (Objects.nonNull(customersArray[i])) {
                    noNullArray[i] = (Phone) customersArray[i].clone();
                }
            }
        }
        return noNullArray;
    }

    @Override
    public void getFirstTenCustomersWithBiggestTraffic() {
        Phone[] customers = new Phone[id];
        Phone[] temp = getCloneCustomersArrayWithoutNull();

        int counter = 0;
        int index = 0;
        int max = 0;

        System.out.println("\nCведения об первых 10 абонентов у который самый большой трафик интернета: \n");
        while (counter < 10) {
            for (int i = 0; i < temp.length; i++) {
                if (Objects.nonNull(temp[i])) {
                    if (max < temp[i].getTraffic()) {
                        max = temp[i].getTraffic();
                        index = i;
                    }
                }
            }
            customers[counter] = temp[index];
            temp[index] = null;
            System.out.println(customers[counter]);
            index = 0;
            max = 0;
            counter++;
        }
    }
}
