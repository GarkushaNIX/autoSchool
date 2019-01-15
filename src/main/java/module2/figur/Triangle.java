package module2.figur;

import java.lang.*;

public class Triangle extends Form {
    public Triangle(double[] x, double[] y, String name){
        super(x, y, name);
    }

    //In case with the triangle, coordinates represent 3 edges
    public double[][] getCoordinates () {
        double[][] coordinates = new double[3][2];
        coordinates[0][0] = x[0];
        coordinates[0][1] = y[0];
        coordinates[1][0] = x[1];
        coordinates[1][1] = y[1];
        coordinates[2][0] = x[2];
        coordinates[2][1] = y[2];

        return coordinates;
    }

    public double getArea () {
        double lengthAB = Math.sqrt((x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]));
        double lengthBC = Math.sqrt((x[1] - x[2]) * (x[1] - x[2]) + (y[1] - y[2]) * (y[1] - y[2]));
        double lengthCA = Math.sqrt((x[2] - x[0]) * (x[2] - x[0]) + (y[2] - y[0]) * (y[2] - y[0]));
        double halfPerimeter = (lengthAB + lengthBC + lengthCA) / 2;

        return (double) Math.round(Math.sqrt(halfPerimeter * (halfPerimeter - lengthAB) * (halfPerimeter - lengthBC) * (halfPerimeter - lengthCA)));
    }


}
