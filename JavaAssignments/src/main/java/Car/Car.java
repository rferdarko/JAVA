package Car;

class Car {
    String brand;
    int mileage;
    double price;
    String color;

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "Volkswagen";
        car1.mileage = 4000;
        car1.price = 4500.75;
        car1.color = "black";

        car2.brand = "Mazda";
        car2.mileage = 2000;
        car2.price = 3500.65;
        car2.color = "red";

        car3.brand = "Nissan";
        car3.mileage = 7000;
        car3.price = 6500.25;
        car3.color = "white";

        System.out.println("Brand 1: " +car1.brand + ", color: " + car1.color);
        System.out.println("Brand 2: " +car2.brand + ", color: " + car2.color);
        System.out.println("Brand 3: " +car3.brand + ", color: " + car3.color);
    }
}
