import java.util.Scanner;
class Pal_Words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        String rev="";
        String word="";
        s=s+" ";
        int l=s.length();
        for(int i=0; i<l; i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                rev = ch + rev;
                word = word +ch;
            }
            else
            {
                if(word.equalsIgnoreCase(rev))
                {
                    System.out.println(word);
                    
                }
                rev="";
                word="";
            }
        }
    }
}