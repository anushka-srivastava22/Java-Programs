import java.util.Scanner;
class Palindrome
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int rev=0;
        int num=n;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        
        if(num==rev)
        {
            System.out.println("Yes "+num+" is a Palindrome Number");
        }
        else
        {
            System.out.println("No "+num+" is not a Palindrome Number");
        }
    }
}
