package module2.figur;

public class Circle extends Form {
    public Circle (double[] x, double[] y, String name){
        super(x, y, name);
    }

    //In case with the circle, coordinates represent center of the circle and random dot on it's perimeter

    public double getArea () {
        double[] x = getX();
        double[] y = getY();
        return (double) Math.round(3.14*((x[0]-x[1]) * (x[0]-x[1]) + (y[0]-y[1]) * (y[0]-y[1]))/2);
    }


}
