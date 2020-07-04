package sri.io;

public class StringDupe {
    boolean noDupe(String name) {
        int[] a = new int[200];
        for (int i = 0; i < name.length() - 1; i++) {
            int ascii = name.charAt(i);
            if (a[+ascii] == +ascii)
                return true;
            else
                a[+ascii] = +ascii;
        }
        return false;
    }

    public static void main(String[] args) {
        StringDupe x = new StringDupe();
        System.out.println(x.noDupe("abcaa"));
        System.out.println(x.noDupe("abcd"));
    }
}
