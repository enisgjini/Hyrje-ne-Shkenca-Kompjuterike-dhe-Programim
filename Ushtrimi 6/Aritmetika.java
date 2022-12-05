public class Aritmetika {

  public static void main(String[] args) {
    short x = 9;
    short y = 2;

    int rez1 = x + y;
    int rez2 = x - y;
    int rez3 = x * y;
    int rez4 = x / y;
    int rez5 = x % y;

    int rezultati1 = y + x;
    int rezultati2 = y - x;
    int rezultati3 = y * x;
    int rezultati4 = y / x;
    int rezultati5 = y % x;

    System.out.println(x + " + " + y + " = " + rez1);
    System.out.println(x + " - " + y + " = " + rez2);
    System.out.println(x + " * " + y + " = " + rez3);
    System.out.println(x + " / " + y + " = " + rez4);
    System.out.println(x + " % " + y + " = " + rez5);

    System.out.println(y + " + " + x + " = " + rezultati1);
    System.out.println(y + " - " + x + " = " + rezultati2);
    System.out.println(y + " * " + x + " = " + rezultati3);
    System.out.println(y + " / " + x + " = " + rezultati4);
    System.out.println(y + " % " + x + " = " + rezultati5);
  }
}
