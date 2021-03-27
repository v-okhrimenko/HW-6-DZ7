import java.util.ArrayList;

public interface PhoneMetods {
    ArrayList<Phone> getCustomerUseNoLocalCall();

    ArrayList<Phone> getCustomerMoreLocalCall(int time);

    ArrayList<Phone> sortCustomerByName();
}
