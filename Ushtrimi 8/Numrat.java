public class Numrat {
    public static void main(String[] args) {
        int a = -16;
        if (a % 2 == 0 && a > 0) {
            System.out.println(a + " është çift - pozitiv");
        } else if (a % 2 == 0 && a < 0) {
            System.out.println(a + " është çift - negativ");
        } else if (a % 2 == 0 && a > 0) {
            System.out.println(a + " është tek - pozitiv");
        } else if (a % 2 != 0 && a < 0) {
            System.out.println(a + " është tek - negativ");
        }
    }
}
