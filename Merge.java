import java.util.Scanner;
class Merge
{
    long n1,n2,mergenum;
    public Merge()
    {
        n1=0;
        n2=0;
        mergenum=0;
    }
    void readNum()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter first number");
        n1=sc.nextInt();
        System.out.println("Enter second number");
        n2=sc.nextInt();
    }
    void Mergenum()
    {
        mergenum=n1;
        long n=n2;
        while(n!=0)
        {
            n=n/10;
            mergenum*=10;
        }
        mergenum+=n2;
    }
    void show()
    {
        System.out.println("First Number : "+n1);
        System.out.println("Second Number : "+n2);
        System.out.println("Merge Number : "+mergenum);
    }
    public static void main(String args [])
    {
        Merge m=new Merge();
        m.readNum();
        m.Mergenum();
        m.show();
    }
}
    