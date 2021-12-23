public class Address {
    private String province;
    private String city;
    private String streetName;
    private int streetNumber;
    private int unitNumber;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Address(String province, String city, String streetName, int streetNumber, int unitNumber) {
        this.province = province;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.unitNumber = unitNumber;
    }

    @Override
    public String toString() {
        return "\n        Province: " + province +
                "\n        City: " + city +
                "\n        Street Name: " + streetName +
                "\n        Street Number: " + streetNumber +
                "\n        Unit Number: " + unitNumber;
    }
}