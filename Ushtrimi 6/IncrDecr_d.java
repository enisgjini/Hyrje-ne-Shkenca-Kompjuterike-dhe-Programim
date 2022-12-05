public class IncrDecr_d {

  public static void main(String[] args) {
    int x = 4, y = 7;
    int z = x-- / y++ - ++x / --y;
    //      4 / 7 - 5 / 6 
    //      0 - 0 
    //      0

    System.out.println(z);
  }
}
