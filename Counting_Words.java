import java.util.Scanner;
class Counting_Words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        s=s.trim();
        int length=s.length();
        int count=1;
        for(int i=0;i<length-1;i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1 != ' ' && ch2 ==' ')
            {
                count++;
            }
        }
        System.out.println("Number of Words in a Sentence : "+count);
    }
}
            