package sri.io;


public class Palindrome {
    public boolean isPalindrome(String name) //2)name recieved
    {
        String reverse = "";
       // int len = name.length() - 1;
        for (int i = name.length()-1; i>=0; i--) {
            reverse = reverse + name.charAt(i);

        }
        return reverse == name;
    }

    public static void main(String[] args) {
        String name = "dad";
        Palindrome pal = new Palindrome();
        boolean
                x = pal.isPalindrome(name); //1)send name as string
        System.out.print("is " + name + " a palindrome ?  \nAns:- " + x);
    }
}