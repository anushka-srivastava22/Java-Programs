import java.util.Scanner;
class Initials
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        s=' '+s;
        for(int i=0; i<s.length()-1; i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1==' ' && ch2!=' ')
            {
                System.out.print(ch2+".");
            }
        }
    }
}