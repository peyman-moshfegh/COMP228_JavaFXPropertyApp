public class House extends Property implements Insurable{
    private double premium;
    private final double RATE = 0.002;

    public double setPremium(int price) {
        return price * RATE;
    }

    public House(int bedrooms, int bathrooms, boolean hasParking, int livingArea, int price, Address address) {
        super(bedrooms, bathrooms, hasParking, livingArea, price, address);
        this.premium = setPremium(price);
    }

    @Override
    public String toString() {
        return "House " +
                super.toString() +
                "\n    Premium: " + premium +
                "\n    Rate: " + RATE;
    }
}