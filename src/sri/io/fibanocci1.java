package sri.io;

public class fibanocci1
{
        int a = 0, b = 1, c;
        int print ()
        {
            c = a + b;
            a = b;
            b = c;
            return (a);
        }
        public static void main (String args[])
        {
            int i, z;
            fibanocci1 m = new fibanocci1();
            System.out.print("0");
            for (i = 0; i <= 15; i++)
                System.out.print(" " + m.print());
        }
}
