import java.util.Scanner;
class Longest_Word
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int l =  s.length();
        int bl=0;
        String s1="";
        String word="";
        for(int i=0; i<l-1; i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                word+=ch;
            }
            else
            {
                int l1=word.length();
                if(bl<l1)
                {
                    bl = l1;
                    s1 = word;
                }
                word = "";
            }
        }
        System.out.println("LongestWord:"+s1);
    }
}