// Name: Naaman Roberts
// Lab: 01.03 Input and Equations
// Date: 9/30/22
import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        //NAME
        /*String name;
		System.out.println("Name:");
		name = input.nextLine();

        System.out.println("Heyo, " + name +". ");
        

        //DETERMINE SHAPE TYPE
        String shapeType;
        System.out.println("Area Of Shapes That Are Not Squares Or Rectangles Calculator Thing ver 0.1");
        System.out.println("Shape (avail shapes are triangle, circle, and trapezoid because they're all annoying. shape types are case sensitive. no capital letters. also theres dodecahedron and myriagon and for some reason so have fun with that ig):");
        shapeType = input.nextLine();

        //AREA OF A TRIANGLE
        if (shapeType.equals("triangle")) {
            double triangleBase;
            double triangleHeight;
            System.out.println("Base length:");
            triangleBase = input.nextDouble();
            System.out.println("Height:");
            triangleHeight = input.nextDouble();

            //SOLVE
            double area1 = (0.5) * (triangleBase * triangleHeight);
            System.out.println("Area of the triangle is " + area1 + " units^2");

        }
        //AREA OF A CIRCLE
        if (shapeType.equals("circle")) {
            double radius;
            System.out.println("Radius of the circle: ");
            radius = input.nextDouble();

            double area2 = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of the circle is " + area2 + " units^2");
        }

        //AREA OF A TRAPEZOID
        if (shapeType.equals("trapezoid")) {
            double baseA;
            double baseB;
            double height;
            System.out.println("Measure of base 1:");
            baseA = input.nextDouble();
            System.out.println("Measure of base 2:");
            baseB = input.nextDouble();
            System.out.println("Height of the trapezoid:");
            height = input.nextDouble();

            double area3 = ((baseA + baseB) / 2) * height;
            System.out.println("Area of the trapezoid is " + area3 + " units^2");
        }

        //AREA OF A DODECAHEDRON
        if (shapeType.equals("dodecahedron")) {
            double edge;
            System.out.println("Edge:");
            edge = input.nextDouble();

            double area4 = 3 * Math.sqrt(25 + 10 * (Math.sqrt(5))) * Math.pow(edge, 2);
            System.out.println("Surface area of the dodecahedron is " + area4 + " units^2");
            System.out.println("Now please, never ask me to do anything like that again.");
        }

        //AREA OF A MYRIAGON
        if (shapeType.equals("myriagon")) {
            System.out.println("sigh. be honest, do you even know what a myriagon is??");
            double side;
            System.out.println("Side length:");
            side = input.nextDouble();

            double area5 = 2500 * Math.pow(side, 2) * 1 / (Math.tan(Math.PI / 10000));
            System.out.println("Area of a myriagon is " + area5 + " units^2");
            System.out.println("Do it in your head next time for crying out loud.");
        

        }*/
   int x = 10;
   int y = 20;

   x++;
   y+=x;
   x=x%5;
   System.out.print("\\* This is not\n a comment *\\");
   
    }
}
