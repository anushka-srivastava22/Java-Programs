import java.util.Scanner;
class A5
{
    public static void main(String args[])
    {
        String item[]=new String[5];
        int price[]=new int[5];
        for(int x=0;x<=4;x++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name of item");
            item[x]=sc.nextLine();
            System.out.println("Enter price of item");
            price[x]=sc.nextInt();
        }
        int amount=0;
        for(int x=0;x<=4;x++)
        {
            amount+=price[x];
        }
        System.out.println("Total Amount = "+amount);
    }
}