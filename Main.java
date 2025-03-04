/* Name Pulkit Shrivastava
    * PRN 23070126098
    * Batch B1 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            if (choice == 7) {
                break;
            }

            Shape shape = null;
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    shape = new Circle(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter side: ");
                    shape = new Square(sc.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    shape = new Sphere(sc.nextDouble());
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    shape = new Cylinder(r, h);
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    shape = new Pyramid(base, height);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            System.out.println("\nShape: " + shape.shapeName);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("Volume: " + shape.calculateVolume());
        }

        sc.close();
    }
}
