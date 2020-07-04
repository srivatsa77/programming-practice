package sri.io;

public class MonogramTest {
    boolean test(String a, String b) {
        int[] y = new int[200];
        int[] z = new int[200];
        for (int i = 0; i < a.length(); i++) {
            int ascii = a.charAt(i);
            y[+ascii] = +ascii;
        }
        for (int i = 0; i < b.length(); i++) {
            int ascii = b.charAt(i);
            z[+ascii] = +ascii;
        }
        for (int i = 0; i < a.length(); i++) {
            if (y[i] != z[i])
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String c = "abcd";
        String d = "acd";
        MonogramTest x = new MonogramTest();
        System.out.println(x.test(c, d));

    }

}
