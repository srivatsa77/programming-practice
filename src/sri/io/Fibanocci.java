package sri.io;

public class Fibanocci {
    public static void main(String args[]) {
        int i, a = 0, b = 1, c;
        for (i = 0; i <= 15; i++) {
            System.out.print(" " + a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
