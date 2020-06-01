package sri.io;


public class Palindrome {
    public boolean isPalindrome(String name) //2)name recieved
    {
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        return sb.equals(name);
    }

    public static void main(String[] args) {
        String name = "dad";
        Palindrome pal = new Palindrome();
        boolean
                x = pal.isPalindrome(name); //1)send name as string
        System.out.print("is " +name + " a palindrome ?  \nAns:- " + x);
    }
}