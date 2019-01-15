package module2.figur;

public class Square extends Form {
    public Square(double[] x, double[] y, String name){
        super(x, y, name);
    }

    //In case with the square, coordinates represent 2 diagonal edges of square

    public double getArea () {
        double[] x = getX();
        double[] y = getY();
        return (double) Math.round(((x[0]-x[1]) * (x[0]-x[1]) + (y[0]-y[1]) * (y[0]-y[1]))/2);
    }


}
