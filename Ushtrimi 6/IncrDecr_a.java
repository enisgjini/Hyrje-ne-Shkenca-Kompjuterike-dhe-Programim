public class IncrDecr_a {
    public static void main(String[] args) {
        int x = 7, y = 3;
        int z = x++ / y++ * --x % y++;
        //      8 / 4 * 7 % 5
        //      2 * 7 % 5
        //      14 % 5 
        //      2    
        System.out.println(z);
    }
}
