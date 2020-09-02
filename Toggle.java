import java.util.Scanner;
class Toggle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int l=s.length();
        String s1="";
        for(int i=0; i<l; i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                ch=(char)(ch+32);
            }
            else if(ch>='a' && ch<='z')
            {
                ch=(char) (ch-32);
            }
            s1=s1+ch;
        }
        System.out.println("Toggle String : "+s1);
    }
}