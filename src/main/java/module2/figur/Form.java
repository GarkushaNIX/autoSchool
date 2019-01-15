package module2.figur;

public abstract class Form {
    protected String name;
    protected double[] x;
    protected double[] y;

    public Form (double[] x, double[] y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public abstract double[][] getCoordinates();

    public abstract double getArea();

    public String getName(){
        return name;
    }


}
