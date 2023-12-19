import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = sc.nextDouble();
        System.out.println("Input y: ");
        double y = sc.nextDouble();
        System.out.println(Coordinates.getColour(x,y));
    }
}
