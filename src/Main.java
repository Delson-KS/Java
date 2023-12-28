import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motocycle motocycle = new Motocycle();
        Circle circle = new Circle(19);

        System.out.println("Area: " +circle.calculateArea());
        System.out.println("Perimeter: " +circle.calculatePerimeter());
        System.out.println(car.start() +' ' + motocycle.start());
    }
}