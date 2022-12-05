public class Ushtrimi2 {
    public static void main(String[] args) {
        int d = 5;
        int e = 2;
        int f = 4;
        int r = (--e % ++d) / --d / --d * f++ / --f + e;
        //      ( 1 % 6 ) / 5 / 4 * 5 / 4 + 2
        //      1 / 5 / 4 * 5 / 4 + 2
        //          0 / 20 / 6 
        //      
        // --------------------------------------
       
        System.out.println(r);
    }
}
