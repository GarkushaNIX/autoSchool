package module2.figur;

public class Circle extends Form {
    public Circle (double[] x, double[] y, String name){
        super(x, y, name);
    }

    //In case with the circle, coordinates represent center of the circle and random dot on it's perimeter
    public double[][] getCoordinates () {
        double[][] coordinates = new double[2][2];
        coordinates[0][0] = x[0];
        coordinates[0][1] = y[0];
        coordinates[1][0] = x[1];
        coordinates[1][1] = y[1];
        return coordinates;
    }

    public double getArea () {
        return (double) Math.round(3.14*((x[0]-x[1]) * (x[0]-x[1]) + (y[0]-y[1]) * (y[0]-y[1]))/2);
    }


}
