package module2.figur;

import java.lang.*;

public class Triangle extends Form {
    public Triangle(double[] x, double[] y, String name){
        super(x, y, name);
    }

    //In case with the triangle, coordinates represent 3 edges

    public double getArea () {
        double[] x = getX();
        double[] y = getY();
        double lengthAB = Math.sqrt((x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]));
        double lengthBC = Math.sqrt((x[1] - x[2]) * (x[1] - x[2]) + (y[1] - y[2]) * (y[1] - y[2]));
        double lengthCA = Math.sqrt((x[2] - x[0]) * (x[2] - x[0]) + (y[2] - y[0]) * (y[2] - y[0]));
        double halfPerimeter = (lengthAB + lengthBC + lengthCA) / 2;

        return (double) Math.round(Math.sqrt(halfPerimeter * (halfPerimeter - lengthAB) * (halfPerimeter - lengthBC) * (halfPerimeter - lengthCA)));
    }


}
