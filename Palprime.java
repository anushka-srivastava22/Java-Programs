import java.util.Scanner;
class Palprime
{
    public static boolean isPrime(int n)
    {
        for(int x=2;x<=n/2;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(int n)
    {
        int r=0;
        for(int x=n;x!=0;x=x/10)
        {
            int d=x%10;
            r=r*10+d;
        }
        if(r==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        //wPalprime p=new Palprime();
        Scanner sc=new Scanner (System.in);
        System.out.println("Entr a bigger number");
        int n=sc.nextInt();
        if(isPrime(n) && isPalindrome(n))
        {
            System.out.println("Yes it is a Palprime Number");
        }
        else
        {
            System.out.println("No it is not a palprime number");
        }
    }
}
     
