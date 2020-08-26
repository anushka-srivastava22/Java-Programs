import java.util.Scanner;
class Palindrome_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        String rev="";
        int l=s.length();
        s=s.toUpperCase();
        for(int i=l-1; i>=0; i--)
        {
            char ch=s.charAt(i);
            rev = rev+ch;
        }
        if(s.equals(rev))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }
}