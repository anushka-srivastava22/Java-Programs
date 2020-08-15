import java.util.Scanner;
class A2
{
    public static void main (String args[])
    {
        int a[]=new int [5];
        for(int x=0;x<5;x++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            a[x]=sc.nextInt();
        }
        
        int count=0; 
        
        for(int x=0;x<=4;x++)
        {
            if(a[x]%2!=0)
            {
                System.out.print(a[x]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Number of odd digits : "+count);
    }
}
                