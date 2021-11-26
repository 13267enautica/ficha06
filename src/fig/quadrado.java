package fig;

public class quadrado extends retangulo{
    public quadrado(double coordX1, double coordX2, double coordY1, double coordY2) {
        super(coordX1, coordX2, coordY1, coordY2);
    }

    public double getArea()
    {
        return x1*y1;
    }



    public double getPer()
    {
        return x1+x2+y1+y2;
    }
}
