public class IncrDecr_e {

  public static void main(String[] args) {
    int x = 4, y = 9;
    int z = (++x + 1) + y-- * --x % ++y;
    
    //  (5 + 1) + 9 * 4 % 10
    //  6 + 36 % 10
    //  6 + 0
    System.out.println(z);
  }
}
