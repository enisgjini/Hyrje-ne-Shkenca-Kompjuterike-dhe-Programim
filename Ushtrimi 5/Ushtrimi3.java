public class Ushtrimi3 {

  public static void main(String[] args) {
    int age = 18;

    switch (age) { //Switch expression
      //Case statements

      case 18:
        System.out.println("You Can Vote");
      // NOTE: There is no break statement after the case 18

      case 16:
        System.out.println("You cannot Vote");

        break;
      case 17:
        System.out.println("you can apply for vote");

        break;
      // Default case statement

      default:
        System.out.println("Can i vote ?");
    }
  }
}
