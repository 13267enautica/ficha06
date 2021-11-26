package fig;

public abstract class figura {
    protected double x1,x2,y1,y2;


    public void setx1(double x)
    {
        this.x1 = x;
    }

    public void setx2(double x)
    {
        this.x2 = x;
    }

    public void sety1(double y)
    {
        this.y1 = y;
    }

    public void sety2(double y)
    {
        this.y2 = y;
    }

    public double getx1()
    {
        return this.x1;
    }

    public double getx2()
    {
        return this.x2;
    }

    public double gety1()
    {
        return this.y1;
    }

    public double gety2()
    {
        return this.y2;
    }

    public abstract double getArea();

    public abstract double getPer();

}
