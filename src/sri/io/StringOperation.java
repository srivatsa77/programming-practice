package sri.io;

public class StringOperation {
    boolean solve(String name) {
        int z = name.length() - 1;
        for (int i = 1; i <= z; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(name.charAt(i)!=name.charAt(j))
                    continue;
                else
                    break;
            }
        }
return
    }

    public static void main(String[] args) {
        String name = "abcd";
        StringOperation x = new StringOperation();
        boolean y = x.solve(name);
        System.out.print(y);

    }
}
