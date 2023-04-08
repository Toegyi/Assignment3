package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String choice = sc.nextLine();

//        if(choice == "C"){
//            System.out.println("Enter the radius of the Circle");
//            double width = sc.nextDouble();
//            System.out.println("Enter the length of the Rectangle");
//            double length = sc.nextDouble();
//            Rectangle rectangle = new Rectangle(width, length);
//            System.out.printf("The area of Rectangle is: %.2f", rectangle.computeArea());
//        } else if (choice == "R") {
//            System.out.println("Enter the width of the Rectangle");
//            double width = sc.nextDouble();
//            System.out.println("Enter the length of the Rectangle");
//            double length = sc.nextDouble();
//            Rectangle rectangle = new Rectangle(width, length);
//            System.out.printf("The area of Rectangle is: %.2f", rectangle.computeArea());
//        } else if (choice == "T") {
//            System.out.println("Enter the base of the Triangle");
//            double base = sc.nextDouble();
//            System.out.println("Enter the height of the Triangle");
//            double height = sc.nextDouble();
//            Triangle triangle = new Triangle(base, height);
//            System.out.printf("The area of Triangle is: %.2f", triangle.computeArea());
//        }
//        else{
//            System.out.println("Invalid choice");
//        }
        switch (choice) {
            case "C":
                System.out.println("Enter the radius of the Circle");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                System.out.printf("The area of Circle is: %.2f", circle.computeArea());
                break;
            case "R":
                System.out.println("Enter the width of the Rectangle");
                double width = sc.nextDouble();
                System.out.println("Enter the length of the Rectangle");
                double length = sc.nextDouble();
                Rectangle rectangle = new Rectangle(width, length);
                System.out.printf("The area of Rectangle is: %.2f", rectangle.computeArea());
                break;
            case "T":
                System.out.println("Enter the base of the Triangle");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the Triangle");
                double height = sc.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.printf("The area of Triangle is: %.2f", triangle.computeArea());
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}

