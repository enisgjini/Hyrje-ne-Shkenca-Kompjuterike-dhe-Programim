import java.util.Scanner;

public class TeDhenatScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emri dhe mbiemri juaj :");
        String EmriDheMbiemri = sc.nextLine();

        System.out.println("ID-ja juaj :");
        long id = sc.nextInt();

        System.out.println("Nota mesatare :");
        float notaMesatare = sc.nextFloat();

        System.out.println("Studenti " + EmriDheMbiemri + " me ID " + id + " ka noten mesatare " + notaMesatare + ".");

    }
}
