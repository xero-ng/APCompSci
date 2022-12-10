//Name: Naaman Roberts
//Lab: 0201 Methods
//Date: 10/11/22
import java.util.Scanner;

import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String firstName;
        String shapeType;
        System.out.println("What is your name: ");
        firstName = input.nextLine();
        System.out.println(greeting(firstName) + ".");
        System.out.println("Enter a shapetype: ");
        shapeType = input.nextLine();

        if (shapeType.equalsIgnoreCase("triangle")) {
            double b;
            double h;
            System.out.print("Base length: ");
            b = input.nextDouble();
            System.out.print("Height: ");
            h = input.nextDouble();
            System.out.println("Area of the triangle is " + areaOfTriangle(b, h) + " units^2");

        }

        if (shapeType.equalsIgnoreCase("myriagon")) {
            double side;
            System.out.print("Side: ");
            side = input.nextDouble();
           
            System.out.println("Area of the myriagon is " + areaOfMyriagon(side) + " units^2");

        }
    }

    public static String greeting(String name) {
        String greeting = "Hello, " + name;
        return greeting;
     }

     public static double areaOfTriangle(double base, double height) {
        double area1 = 0.5 * (base * height);
        return area1;
    }

    public static double areaOfMyriagon(double SideLength) {
        double area2 = 2500 * Math.pow(SideLength, 2) * 1 / (Math.tan(Math.PI / 10000));
        return area2;
    }
    
}

