package fig;

public class circulo extends retangulo{
    private double x, y, raio;

    public circulo (double coordX1, double coordX2, double coordY1, double coordY2){
        super(coordX1,coordX2,coordY1,coordY2);

        if (coordX1 <= coordX2){
            this.x = coordX2 - coordX1;
            this.raio = coordX2 - coordX1;}
        else{
            this.x = coordX1 - coordX2;
            this.raio = coordX2 - coordX1;}

        if (coordY1 <= coordY2)
            this.x = coordY2 - coordY1;
        else
            this.x = coordY1 - coordY2;

        if (coordX2>coordX1)

        else
            this.raio = coordX1 - coordX1;

        if
    }
    public double getCentroX(){
        return x;
    }

    public double getCentroY(){
        return y;
    }

    public double getRaio(){
        this.raio =
    }

}
