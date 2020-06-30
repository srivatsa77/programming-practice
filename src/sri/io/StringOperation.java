package sri.io;

public class StringOperation {
    boolean hasDupe(String name) {

        for (int i = 1; i < name.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (name.charAt(i) == name.charAt(j))
                    return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        StringOperation x = new StringOperation();
        System.out.println(x.hasDupe("abca"));
        System.out.println(x.hasDupe("abcd"));
        System.out.println(x.hasDupe("cdefgad"));

    }
}
