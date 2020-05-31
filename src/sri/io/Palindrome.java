package sri.io;


public class Palindrome {

    public boolean isPalindrome(String name) //2)name recieved
    {
        String reverse="" ;
        int len=name.length()-1 ;
        for (int i = len; i>=0; i--) {
            reverse = reverse + name.charAt(i) ;
        }
       if(reverse.equals(name))
           return true;
            else
                return false ;
    }

    public static void main(String[] args) {
        String name = "dad";
        Palindrome pal = new Palindrome();
        boolean
                x = pal.isPalindrome(name); //1)send name as string
        System.out.print(name + " is paneldrome ?  = " + x);
    }
}