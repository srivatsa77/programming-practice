package sri.io;

public class Fib {
    int a = 0, b = 1, c;

    int print() {
        c = a + b;
        a = b;
        b = c;
        return (a);
    }

    public static void main(String args[]) {
        int i, z;
        Fib m = new Fib();
        System.out.print("0");
        for (i = 0; i <= 15; i++)
            System.out.print(" " + m.print());
    }

}



