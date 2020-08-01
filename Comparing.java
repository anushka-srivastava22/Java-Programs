import java.util.Scanner;
class Comparing 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter String 1");
        String a=sc.nextLine();
        System.out.println("Enter String 2");
        String b=sc.nextLine();
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The Strings are Equal");
        }
        else
        {
            System.out.println("The String are not Equal");
        }
    }
}