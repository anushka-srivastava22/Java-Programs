import java.util.Scanner;
class Increase_Vowel
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Entr a string");
        String s=sc.nextLine();
        s=s.toUpperCase();
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                ch++;
            }
            System.out.print(ch);
        }
        
    }
}