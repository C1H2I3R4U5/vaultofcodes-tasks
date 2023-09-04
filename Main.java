In your code, you're trying to call a stop() method on the car object, but the Car class doesn't have a stop() method defined.
so we have to include the stop() method in program.

Suggestion:
you have placed main function at the end of program,it is not isssue but better to add at start of the program.

Corrected code :

//program to demonstrate the basis OOP principles//
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.stop();
    }
}
class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the car.");
    }

    public void stop() {
        System.out.println("Stopping the car.");
    }
}


Output : Starting the car.
         Stopping the car.