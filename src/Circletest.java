import java.util.Scanner;
public class Circletest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap percent la phan tram ban can tang len: ");
        double percent = scanner.nextDouble();
        Circle circle1 = new Circle();;


    }


}
