public class IncrDecr_b {

  public static void main(String[] args) {
    int x = 4, y = 6;
    int z = x-- * y-- % ++y * --x;

    // 4 * 6 % 6 * 2
    // 24 % 12
    // 0 
    System.out.println(z);
  }
}
