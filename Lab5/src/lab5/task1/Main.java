package lab5.task1;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;


interface Leg {
    int times = 2;
    void walk();
}
interface Arm {
    int times = 3;
    void shake();
}
abstract class Machine {
    private Random random = new Random();
    void start() {
        if (random.nextInt() % 2 == 0)
            System.out.println("vrum vrum");
        else
            System.out.println("vrum vrum vrum");
    }

}
class Robot implements Leg, Arm {
    public void walk() {
        for (int i = 0; i < Leg.times; i++)
            System.out.print("top.. ");
        System.out.print("\n");
    }
    public void shake() {
        for (int i = 0; i < Arm.times; i++)
            System.out.print("clap..");
        System.out.print("\n");
    }
}
 class Car extends Machine {
    protected void start() {
        super.start();
        int times = 5;
        for (int i = 0; i < times; i++)
            System.out.print ("VRUM ");
        System.out.print("\n");
    }
}
class CoffeeMachine extends Machine {
    protected void start() {
        super.start();
        int times = 5;
        for (int i = 0; i < times; i++)
            System.out.print ("didish ");
        System.out.print("\n");
    }
}


public class Main {

    public static void main(String[] args) {
	    Robot robot = new Robot();
	    robot.shake();
	    robot.walk();

	    Car car = new Car();

	    car.start();

	    CoffeeMachine coffeeMachine = new CoffeeMachine();
	    coffeeMachine.start();
    }
}
