package sri.io;

public class palindrome {
    public String reverseString(String name) //2)name recieved
    {
        char[] a = new char[name.length()];
        char[] ch = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            ch[i] = name.charAt(i);   //3)name converted to char array
        }
        int len = a.length - 1;
        for (int i = len; i >= 0; i--) {
            a[len - i] = ch[i]; //4)name reversed using char array
        }

        String str2 = String.valueOf(a); //5)reversed char array to string

        if (str2.equals(name)) //6)checking if reversed string is equal to original name
            return ("palindrome");// 7)if yes
                                             // its a palindrome
        else
            return ("not a palindrome");//8)if not
                                                 // its not a palindrome
    }

    public static void main(String[] args) {
        String name = "madm";
        palindrome m = new palindrome();
        String x = m.reverseString(name); //1)send name as string
        System.out.print(" " + x);
    }
}