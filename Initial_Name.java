import java.util.Scanner;
class Initial_Name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        s=' '+s;
        int last_space=s.lastIndexOf(' ');
        for(int i=0; i<last_space-1; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1==' ' && ch2!=' ')
            {
                System.out.print(ch2+ ".");
            }
        }
        char ch=s.charAt(last_space+1);
        String s1=s.substring(last_space+2);
        s1=s1.toLowerCase();
        String s2=ch+s1;
        System.out.println(s2);
    }
}