public class FuqiaMotorike {
    public static void main(String[] args) {
        double p_w = 1.1;

        double p_hp = p_w / 745.7;

        if (p_w < 1.0) {
            System.out.println("Gabim");
        } else {
            System.out.println(p_hp);
        }
    }
}