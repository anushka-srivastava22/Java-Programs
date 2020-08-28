class Plane 
{
    protected int x1,y1;
    public Plane(int nx, int ny)
    {
        x1=nx;
        y1=ny;
    }
    public void display()
    {
        System.out.println("x1="+x1);
        System.out.println("y1s="+y1);
    }
}