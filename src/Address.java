public class Address {

    private String country;
    private String city;
    private String street;
    private String buildNumb;
    private int appNumb;

    public Address(String country, String city, String street, String buildNumb, int appNumb) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.buildNumb = buildNumb;
        this.appNumb = appNumb;
    }

    public Address() {

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

    public int getAppNumb() {
        return appNumb;
    }

    public void setAppNumb(int appNumb) {
        this.appNumb = appNumb;
    }

    @Override
    public String toString() {
        return country + ", " + city + ", " + street + ", " +
                "д." + buildNumb + ", " +
                "кв." + appNumb;
    }

}
