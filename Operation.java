import java.util.Scanner;
class Operation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter second number");
        int n2=sc.nextInt();
        if (n1%2==0&&n2%2==0)
        {
            System.out.println("Ans="+(n1*n2));
        }
        else if (n1%2!=0&&n2%2!=0)
        {
            System.out.println("Ans="+(n1/n2));
        }
        else if(n1%2==0&&n2%2!=0)
        {
            System.out.println("Ans="+(n1+n2));
        }
        else if (n1%2!=0&&n2%2==0)
        {
            System.out.println("Ans="+(n1-n2));
        }
        else
        {
            System.out.println("Invalid");
        }
        System.out.println("Enter operand");
        char ch=sc.next().charAt(0);
        switch (ch)
        {
            case '+':System.out.println("Ans="+(n1+n2));
            break;
            case '-':System.out.println("Ans="+(Math.abs(n1-n2)));
            break;
            case '*':System.out.println("Ans="+(n1*n2));
            break;
            case '/':System.out.println("Ans="+(n1/n2));
            break;
            default:System.out.println("Invalid Input");
            break;
        }
    }
}
           
        
        
        
        
    
