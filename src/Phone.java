public class Phone {

    private int id;
    private String surname;
    private String firstName;
    private String patronymic;
    private Address address;
    private String telephoneNumber;
    private int creditCardNumber;
    private int debit;
    private int credit;
    private int timeLocalCall;
    private int timeNoLocalCall;
    private int traffic;

    public Phone() {
    }

    public Phone(String surname, String firstName, String patronymic, Address address, String telephoneNumber, int creditCardNumber, int debit, int credit, int timeLocalCall, int timeNoLocalCall, int traffic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
        this.credit = credit;
        this.timeLocalCall = timeLocalCall;
        this.timeNoLocalCall = timeNoLocalCall;
        this.traffic = traffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public double getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getTimeLocalCall() {
        return timeLocalCall;
    }

    public void setTimeLocalCall(int timeLocalCall) {
        this.timeLocalCall = timeLocalCall;
    }

    public double getTimeNoLocalCall() {
        return timeNoLocalCall;
    }

    public void setTimeNoLocalCall(int timeNoLocalCall) {
        this.timeNoLocalCall = timeNoLocalCall;
    }

    public double getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return
                "id=" + id + '\n' +
                        "ФИО: " + surname + " " + firstName + " " + patronymic + '\n' +
                        "Адресс: " + address + '\n' +
                        "Телефон: " + telephoneNumber + '\n' +
                        "Кредитная карта: " + creditCardNumber + '\n' +
                        "Дебет: " + debit + '\n' +
                        "Кредит: " + credit + '\n' +
                        "Внутрисетевые звонки: " + timeLocalCall + '\n' +
                        "За пределами сети: " + timeNoLocalCall + '\n' +
                        "Траффик: " + traffic + "мб";
    }


    public void setAddress(String country, String city, String street, String buildNumb, int appNumb) {
        this.address = new Address(country, city, street, buildNumb, appNumb);
    }

}
