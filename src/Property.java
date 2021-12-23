public class Property {
    private int bedrooms;
    private int bathrooms;
    private boolean hasParking;
    private int livingArea;
    private int price;
    private Address address;

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean getHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public int getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(int livingArea) {
        this.livingArea = livingArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Property(int bedrooms, int bathrooms, boolean hasParking, int livingArea, int price, Address address) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.hasParking = hasParking;
        this.livingArea = livingArea;
        this.price = price;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Property:" +
                "\n    Bedrooms: " + bedrooms +
                "\n    Bathrooms: " + bathrooms +
                "\n    Parking: " + (hasParking ? "Yes" : "No") +
                "\n    Living Area: " + livingArea +
                "\n    Price: " + "$" + price +
                "\n    Address: " + address;
    }
}