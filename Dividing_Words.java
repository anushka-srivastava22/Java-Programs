import java.util.Scanner;
class Dividing_Words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=0; i<s.length()-n; i++)
        {
            System.out.println(s.substring(i,i+n));
            
        }
    }
}
        