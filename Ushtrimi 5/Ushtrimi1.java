public class Ushtrimi1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 2;

        int r = a++ - ++a * b++ * --a / ++c;
        //      4 - 6  * 3 + 5 / 3
        //      4 - 18 * 5 / 3
        //      4 - 90 / 3 
        //      4 - 30 
        //      -26       
        System.out.println(r);

    }
}