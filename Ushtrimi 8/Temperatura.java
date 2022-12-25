public class Temperatura {
    public static void main(String[] args) {
        float temperaturaC = 25.60f;
        float temperaturaF = temperaturaC * 9 / 5 + 32;

        if (temperaturaF < 50.00f )
        {
            System.out.println("Vlera e temperaturës është e  ulët");
        }
        else
        {
            System.out.println("Vlera e temperaturës është e  lartë");
        }
    }
}