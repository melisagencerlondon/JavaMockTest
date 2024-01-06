package Java.javaquiz2;

class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.9;
        } else {
            return carPrice * 0.8;
        }
    }
}

class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
}

public class CarTester {
    public static void main(String[] args) {
        Truck myTruck = new Truck(25000, "Blue", 2500);
        Sedan mySedan = new Sedan(20000, "Red", 18);

        System.out.println("Truck Sale Price: $" + myTruck.calculateSalePrice());
        System.out.println("Sedan Sale Price: $" + mySedan.calculateSalePrice());
    }
}