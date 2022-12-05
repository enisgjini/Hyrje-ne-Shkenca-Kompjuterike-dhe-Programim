public class IncrDecr_c {

  public static void main(String[] args) {
    int x = 8, y = 5;
    int z = --y / x++ + y++ % --x;
    //       4 / 8 + 4 % 7
    //       0 + 4 
    //       4
    System.out.println(z);
  }
}
