
public class main {
    public static void main(String[] args) {

      /*  Vehicle car = new Vehicle(10, "blue", 10);

        car.speedUp(); */

        Vehicle car = new Vehicle(50, "green", 4, 5);

        Vehicle cycle =new Vehicle(25, "blue", 2, 8);

        int carSize = car.getSize();
        System.out.println("Car Size = " + carSize);

        String carColor = car.getColor();
        System.out.println("Car Color = " + carColor);

        System.out.println("Car Wheels = " + car.getWheels());

        System.out.println("Car Gears = " + car.getNumbOfGears());

        int cycleSize = cycle.getSize();
        System.out.println("Cycle Size = " + cycleSize);

        System.out.println("Cycle Color = " + cycle.getColor());

        System.out.println("Cycle Wheels = " + cycle.getWheels());

        System.out.println("Cycle Gears = " + cycle.getNumbOfGears());

    }
}
