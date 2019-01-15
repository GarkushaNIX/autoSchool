package module2.figur;

public abstract class Form {
    private String name;
    private double[] x;
    private double[] y;

    Form (double[] x, double[] y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public abstract double getArea();

    public String getName(){
        return name;
    }

    double[] getX() {
        return x;
    }

    double[] getY() {
        return y;
    }
}
