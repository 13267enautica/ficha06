package fig;

public class retangulo extends figura {

    public retangulo(double coordX1, double coordX2, double coordY1, double coordY2)
    {
        this.x1 = coordX1;
        this.x2 = coordX2;
        this.y1 = coordY1;
        this.y2 = coordY2;
    }
    public double getBase()
    {
        if (x2>x1)
            return this.x2 - this.x1;
        else
            return this.x1 - this.x2;
    }

    public double getAltura()
    {
        if (y2>y1)
            return this.y2 - this.y1;
        else
            return this.y1 - this.y2;
    }

    public double getArea()
    {
        return getAltura() * getBase();
    }

    public double getPer()
    {
        return 2 * getAltura() + 2 * getBase();
    }
}
