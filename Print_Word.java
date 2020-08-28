import java.util.Scanner;
class Print_Word
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        String word = "";
        s=s+" ";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch != ' ')
            {
                word = word + ch;
            }
            else
            {
                int l = word.length();
                System.out.println(word + " - " +l);
                word = "";
            }
        }
    }
}
      
        
        
           