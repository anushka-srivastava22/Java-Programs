import java.util.Scanner;
class Rectangle
{
    int l,b;
    void input(int x, int y)
    {
        l=x;
        b=y;
    }
    int area()
    {
        return l*b;
    }
    int perimeter()
    {
        return 2*(l+b);
    }
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.input(4,5);
        int area = r.area();
        int perimeter = r.perimeter();
        System.out.println("Area of Rectangle = "+area);
        System.out.println("Perimeter of Rectangle = "+perimeter);
    }
}
            
   