import java.util.Scanner;
class Frequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int length = s.length();
        s=s.toUpperCase();
        int ar[] = new int [26];
        char ch='A';
        for(int i=0; i<length; i++)
        {
            ar[s.charAt(i)-'A']++;
        }
        for(int i=0;i<26;i++)
        {
                
                System.out.println(ch+"  "+ar[i]);
            
        }
    }
}
            