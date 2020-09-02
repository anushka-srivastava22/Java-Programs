import java.util.Scanner;
class words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s+" ";
        String word="";
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                word+=ch;
            }
            else
            {
                char ch1=word.charAt(0);
                if(ch1 == 'A' || ch1 == 'a')
                {
                    System.out.println(word);
                }
                word = "";
            }
        }
    }
}