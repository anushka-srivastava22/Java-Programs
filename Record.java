import java.util.Scanner;
class Record
{
     String name[];
     int rank[];
    public Record()
    {
        String name[]=new String[3];
        int rank[]=new int[3];
    }
    public  void readValues()
    {
        Scanner sc=new Scanner(System.in);
        for(int x=0;x<=2;x++)
        {
            System.out.println("Enter name");
            name[x]=sc.nextLine();
            System.out.println("Enter rank");
            rank[x]=sc.nextInt();
        }
    }
    public void display()
    {
        for(int x=0;x<=2;x++)
        {
            System.out.println("Name = "+name[x]);
            System.out.println("Rank = "+rank[x]);
        }
    }
}