import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sheno vlerën e peshës");
        double m = sc.nextDouble();
        System.out.println("Sheno vlerën e gjatësisë");
        double l = sc.nextDouble();


        System.out.println("BMI = " + m + " / " + l + " = " + (m / Math.pow(l, 2)));
    }
}
