import java.util.Scanner;
class Last_Occurence
{
    public static void main(String args[])
    {
        String s="Hello World Hello Universe Hello Baby";
        int i=s.lastIndexOf("Hello");
        if(i==-1)
        {
            System.out.println("Hello Not Found");
        }
        else
        {
            System.out.println("Last Occurence of Hello is at index = "+i);
        }
    }
}