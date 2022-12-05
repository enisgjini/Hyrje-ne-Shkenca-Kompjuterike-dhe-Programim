public class Kalkulimi {

  public static void main(String[] args) {
    int a = 65;

    /*
    
        -- Forma e parë (I) -- 
    
        a += 3;
        System.out.println(a);  a += 3 -> 68

        a -= 6;
        System.out.println(a); a -= 6 -> 62

        a *= 9;
        System.out.println(a); a *= 9 -> 558

        a /= 12;
        System.out.println(a); a /= 12 -> 46

        a %= 15;
        System.out.println(a); a %= 15 -> 1 

    */ 

    // Forma e dytë (II)
    int mbledhja = a + 3;
    int zbritja = mbledhja - 6;
    int shumezimi = zbritja * 9;
    int pjestimi = shumezimi / 12;
    int modulo = pjestimi % 15;

    System.out.println(mbledhja);
    System.out.println(zbritja);
    System.out.println(shumezimi);
    System.out.println(pjestimi);
    System.out.println(modulo);
  }
}
