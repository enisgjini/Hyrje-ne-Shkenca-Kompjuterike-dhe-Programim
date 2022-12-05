public class D1 {

  public static void main(String[] args) {
    int x = 17;
    switch (x = 12) {
      case 3:
        x += 1;
        break;
      case 9:
        x += 1;
        break;
      case 12:
        x += 4;
      case 20:
        x -= 5;
        break;
    }
    System.out.println("Vlera e \n x = " + --x);
  }
}
