package sri.io;

public class sreverse {
        //String name[]= {"s", "r", "i", "n" , "u"}; //a[] {"u", "n", "i", "r", "

        public String[] reverseString(String[]name)
        {
            String a[] = new String[name.length];
            int len = name.length - 1;
            for (int i = len; i >= 0; i--) {
                a[len - i] = name[i]; //i=3 => name[i], a[4] = 'n'
            }
            return a;
        }
        public static void main (String[]args)
        {
            String name[] = {"s", "r", "i", "asas", "test", "ME"}; //2

            sreverse m = new sreverse();
            String[] x = m.reverseString(name);
            for (int i = 0; i < x.length; i++) {
                System.out.print(" " + x[i]);
            }

            //System.out.print(m.reverseString());
        }
}
