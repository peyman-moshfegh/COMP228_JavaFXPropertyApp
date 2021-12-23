import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] types = {"House", "Town House", "Condo"};

        Object selected = JOptionPane.showInputDialog(null,
                "Please choose the property type\n ",
                "Property Type",
                3,
                null,
                types,
                "0");
        String type = selected.toString();

        Object value = JOptionPane.showInputDialog("Please enter the number of bedrooms\n ");
        int bedrooms = Integer.parseInt(value.toString());

        value = JOptionPane.showInputDialog("Please enter the number of bathrooms\n ");
        int bathrooms = Integer.parseInt(value.toString());

        String[] yesNo = {"Yes", "No"};
        selected = JOptionPane.showInputDialog(null,
                "Does the property have parking?\n ",
                "Property Type",
                3,
                null,
                yesNo,
                "0");
        boolean hasParking = selected.toString().equals("Yes");

        value = JOptionPane.showInputDialog("Please enter the living area\n ");
        int livingArea = Integer.parseInt(value.toString());

        value = JOptionPane.showInputDialog("Please enter the price\n ");
        int price = Integer.parseInt(value.toString());

        value = JOptionPane.showInputDialog("Please enter the Province\n ");
        String province = value.toString();

        value = JOptionPane.showInputDialog("Please enter the city\n ");
        String city = value.toString();

        value = JOptionPane.showInputDialog("Please enter the street name\n ");
        String streetName = value.toString();

        value = JOptionPane.showInputDialog("Please enter the street number\n ");
        int streetNumber = Integer.parseInt(value.toString());

        value = JOptionPane.showInputDialog("Please enter the unit number\n ");
        int unitNumber = Integer.parseInt(value.toString());

        Address address = new Address(province, city, streetName, streetNumber, unitNumber);

        Property property;

        if (type.equals("House")) {
            property = new House(bedrooms, bathrooms, hasParking, livingArea, price, address);
        } else if (type.equals("Town House")) {
            property = new TownHouse(bedrooms, bathrooms, hasParking, livingArea, price, address);
        } else {
            property = new Condo(bedrooms, bathrooms, hasParking, livingArea, price, address);
        }

        JOptionPane.showMessageDialog(null,
                property.toString(),
                "Property Information",
                JOptionPane.PLAIN_MESSAGE);
    }
}