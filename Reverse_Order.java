import java.util.Scanner;
class Reverse_Order
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int l=s.length();
        s=" "+s;
        String word="";
        for (int i=l; i>=0; i--)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                word = ch+word;
            }
            else
            {
                System.out.print(word+" ");
                word="";
            }
        }
    }
}
                