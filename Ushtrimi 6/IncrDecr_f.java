public class IncrDecr_f {

  public static void main(String[] args) {
    int x = 5, y = 3;
    int z = y++ % --x / y-- + (x + 1);
    

    System.out.println(z);
  }
}
