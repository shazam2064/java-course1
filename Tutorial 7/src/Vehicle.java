
public class Vehicle {
    private int size;
    private String color;
    private int wheels;
    private int numbOfGears;

    public static void main(String[] args) {
        // Vehicle car = new Vehicle(100, "red", 5);
        // System.out.println(car.size);
        // System.out.println(car.color);
        // System.out.println(car.wheels);

        // Part of THE BIG, BAD, CHALLENGE //

        Vehicle truck = new Vehicle(200, "white",8, 5);
        System.out.println(truck.size);
        System.out.println(truck.color);
        System.out.println(truck.wheels);
        System.out.println(truck.numbOfGears);
    }

    /* Vehicle(int size, String color, int numbOfGears) {
        this.size = size;
        this.color = color;
        this.wheels = 4;
        this.numbOfGears = numbOfGears;
    } */

    // THE UGLY, BAD, CHALLENGE //


    Vehicle(int size, String color, int wheels, int numbOfGears) {
        this.size = size;
        this.color = color;
        this.wheels = wheels;
        this.numbOfGears = numbOfGears;
    }

    void onOrOff() {
        System.out.println("Vehicle is on");
    }

    void speedUp() {
        System.out.println("Speeding up");
    }

    void brake() {
        System.out.println("braking");
    }

    int getSize() {
        return size;
    }

    String getColor() {
        return color;
    }

    int getWheels() {
        return wheels;
    }

    int getNumbOfGears() {
        return numbOfGears;
    }

}




// public static void main(String[] args) {
        // write your code here
   // }