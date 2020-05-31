package sri.io;

public class Rev
     {
        public String reverseString(String name) //2)name recieved
        {
            char[] a = new char[name.length()];
            char[] ch = new char[name.length()];
            for (int i = 0; i < name.length(); i++)
            {
                ch[i] = name.charAt(i);   //3)name converted to char array
            }
            int len=a.length-1 ;
            for (int i = len ; i>=0; i--)
            {
                a[len-i]=ch[i]  ; //4)char array reversed name
            }
            String str2 = String.valueOf(a); //5)reversed chararray to string
            return(str2) ; //6)return newName;
        }
        public static void main(String[] args)
        {
            String name="semaJ norbeL";
            Rev m = new Rev() ;
            String x=m.reverseString(name); //1)send name as string
            System.out.print(" "+x);
        }
    }
