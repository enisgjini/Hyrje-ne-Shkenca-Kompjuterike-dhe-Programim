public class Miljet {
    public static void main(String[] args) {
        long kilometra = 3;
        double milje = kilometra * 0.62137;

        if (kilometra < 1) {
            System.out.println("Gabim");
        } else {
            System.out.println(milje);
        }

    }
}