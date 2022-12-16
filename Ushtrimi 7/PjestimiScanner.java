import java.util.Scanner;

public class PjestimiScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno nje numer te plotë");
        long p = sc.nextLong();
        System.out.println("Sheno perseri nje numer te plotë");
        long q = sc.nextLong();

        System.out.println("--------------------------");
        System.out.println(p + " / " + q + " = " + (double) p / q);

    }
}
