import java.util.Scanner;
class Pal_String_M2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s= sc.nextLine();
        int start_index = 0;
        int last_index = s.length()-1;
        boolean found = true;
        while(start_index < last_index)
        {
            char ch1 = s.charAt(start_index);
            char ch2 = s.charAt(last_index);
            if(ch1 == ch2)
            {
                start_index ++;
                last_index --;
            }
            else
            {
                found = false;
                break;
            }
        }
        if(found)
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }
}