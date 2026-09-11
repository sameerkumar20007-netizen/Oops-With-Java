interface Rentable {

    double TAX_RATE = 0.05;

    double calculateRent(int days);
}

class Car implements Rentable {

    static int totalVehiclesRented = 0;

    @Override
    public double calculateRent(int days) {
        totalVehiclesRented++;
        return 1500 * days;
    }
}

class Bike implements Rentable {

    @Override
    public double calculateRent(int days) {
        Car.totalVehiclesRented++;
        return 500 * days;
    }
}

public class UseCase3 {

    public static void main(String[] args) {

        Rentable car = new Car();
        Rentable bike = new Bike();

        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);

        System.out.println("Car rent incl. tax: "
                + (carRent + carRent * Rentable.TAX_RATE));

        System.out.println("Bike rent incl. tax: "
                + (bikeRent + bikeRent * Rentable.TAX_RATE));

        System.out.println("Total vehicles rented: "
                + Car.totalVehiclesRented);
    }
}