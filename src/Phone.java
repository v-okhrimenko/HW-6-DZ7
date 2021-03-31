public class Phone implements Comparable<Phone>, Cloneable {
    private int id;
    private String surname;
    private String firstName;
    private String patronymic;
    private Address address;
    private String telephoneNumber;
    private String creditCardNumber;
    private long debit;
    private long credit;
    private int innerCityCall;
    private int longDistanceCall;
    private int traffic;

    public Phone() {
    }

    public Phone(String surname, String firstName, String patronymic, Address address, String telephoneNumber, String creditCardNumber, long debit, long credit, int innerCityCall, int longDistanceCall, int traffic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
        this.credit = credit;
        this.innerCityCall = innerCityCall;
        this.longDistanceCall = longDistanceCall;
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

    public void setAddress(String country, String city, String street, String buildNumb, String appNumb) {
        this.address = new Address(country, city, street, buildNumb, appNumb);
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getDebit() {
        return debit;
    }

    public void setDebit(long debit) {
        this.debit = debit;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public int getInnerCityCall() {
        return innerCityCall;
    }

    public void setInnerCityCall(int innerCityCall) {
        this.innerCityCall = innerCityCall;
    }

    public int getLongDistanceCall() {
        return longDistanceCall;
    }

    public void setLongDistanceCall(int longDistanceCall) {
        this.longDistanceCall = longDistanceCall;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    @Override
    public Object clone() {
        Phone phone;
        try {
            phone = (Phone) super.clone();
        } catch (CloneNotSupportedException e) {
            phone = new Phone(
                    this.getSurname(), this.getFirstName(), this.getPatronymic(), this.getAddress(), this.getTelephoneNumber(),
                    this.getCreditCardNumber(), this.getDebit(), this.getCredit(), this.getInnerCityCall(), this.getLongDistanceCall(),
                    this.getTraffic());
        }
        phone.address = (Address) this.address.clone();
        return phone;

    }

    public int compareTo(Phone p) {
        return getSurname().compareTo(p.getSurname());
    }

    @Override
    public String toString() {
        return "id=" + id + '\n' +
                "ФИО: " + surname + " " + firstName + " " + patronymic + '\n' +
                "Адресс: " + address + '\n' +
                "Телефон: " + telephoneNumber + '\n' +
                "Кредитная карта: " + creditCardNumber + '\n' +
                "Дебет: " + debit + '\n' +
                "Кредит: " + credit + '\n' +
                "Внутригородские звонки: " + innerCityCall + '\n' +
                "Междугородние звонки: " + longDistanceCall + '\n' +
                "Траффик: " + traffic + " мб" + '\n' +
                "_______________________________________\n";
    }

    static class Address implements Cloneable {
        private String country;
        private String city;
        private String street;
        private String buildNumb;
        private String appNumb;

        public Address() {
        }

        public Address(String country, String city, String street, String buildNumb, String appNumb) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.buildNumb = buildNumb;
            this.appNumb = appNumb;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getBuildNumb() {
            return buildNumb;
        }

        public void setBuildNumb(String buildNumb) {
            this.buildNumb = buildNumb;
        }

        public String getAppNumb() {
            return appNumb;
        }

        public void setAppNumb(String appNumb) {
            this.appNumb = appNumb;
        }

        @Override
        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                return new Address(this.getCountry(), this.getCity(), this.getStreet(), getBuildNumb(), getAppNumb());
            }

        }

        @Override
        public String toString() {
            return country + ", " + city + ", " + street + ", " +
                    "д." + buildNumb + ", " +
                    "кв." + appNumb;
        }
    }
}
