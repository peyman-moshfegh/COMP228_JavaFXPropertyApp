public class TownHouse extends Property implements Insurable{
    private double premium;
    private final double RATE = 0.0015;

    public double setPremium(int price) {
        return price * RATE;
    }

    public TownHouse(int bedrooms, int bathrooms, boolean hasParking, int livingArea, int price, Address address) {
        super(bedrooms, bathrooms, hasParking, livingArea, price, address);
        this.premium = setPremium(price);
    }

    @Override
    public String toString() {
        return "Town House " +
                super.toString() +
                "\n    Premium: " + premium +
                "\n    Rate: " + RATE;
    }
}