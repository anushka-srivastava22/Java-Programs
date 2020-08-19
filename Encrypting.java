import java.util.Scanner;
class Encrypting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int l=s.length();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        String s1="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'-n)
            {
                ch=(char)(ch+n);
            }
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}
        
