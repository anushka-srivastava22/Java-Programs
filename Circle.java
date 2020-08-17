class Circle extends Plane
{
    private int x2,y2;
    private double radius,area;
    public Circle(int mx1, int my1, int mx2, int my2)
    {
        super (mx1,my1);
        x2=mx2;
        y2=my2;
        radius=0.0;
        area=0.0;
    }
    public void findRadius()
    {
        radius=((Math.sqrt(Math.pow((x2-x1),2)))+(Math.sqrt(Math.pow((y2-y1),2))))/2.0;
    }
    public void findArea()
    {
        area=3.14*radius*radius;
    }
    public void show()
    {
        super.display();
        findRadius();
        findArea();
        System.out.println("x2="+x2);
        System.out.println("y2="+y2);
        System.out.println("radius="+radius);
        System.out.println("Area="+area);
    }
}
    