package module2;

import module2.figur.*;

import java.util.Random;

public class Main {

    public static void main (String[] args){
        System.out.println("\nMassive with 10 random figures\n");
        Form[] formsArray = new Form[10];

        for (int i=0; i<10; i++) {
            formsArray[i] = randomForm();
        }

        System.out.println("\nAscending sorting of massive by area");

        Form fig;

        for (int j=0; j<9; j++) {
            for (int i=(j+1); i<10; i++) {
                if (formsArray[j].getArea() > formsArray[i].getArea()) {
                    fig = formsArray[j];
                    formsArray[j] = formsArray[i];
                    formsArray[i] = fig;
                }
            }
        }

        System.out.println("\nNew order of massive\n");

        for (int i=0; i<10; i++) {

            System.out.println(formsArray[i].getName() + ", S = " + formsArray[i].getArea());
        }
    }

    private static double randomCoordinate () {
        return (Math.round((Math.random()-0.5)*1000.0))/10.0; //random number between -50 and 50 with 2 digits after the dot
    }

    private static Form randomForm () {
        Random ran = new Random();
        double[] x = new double[3];
        double[] y = new double[3];
        String name;
        Form theFigure;

        switch (ran.nextInt(3)) {

            //square
            case 0:{
                x[0] = randomCoordinate();
                x[1] = randomCoordinate();
                y[0] = randomCoordinate();
                y[1] = randomCoordinate();
                name = "Sqare #" + (Math.round(Math.random()*100.0));

                theFigure = new Square(x,y,name);

                System.out.println(name + ", S = " + theFigure.getArea());
                break;
            }

            //circle
            case 1:{
                x[0] = randomCoordinate();
                x[1] = randomCoordinate();
                y[0] = randomCoordinate();
                y[1] = randomCoordinate();
                name = "Circle #" + (Math.round(Math.random()*100.0));

                theFigure = new Circle(x,y,name);

                System.out.println(name + ", S = " + theFigure.getArea());
                break;
            }

            //triangle
            default:{
                x[0] = randomCoordinate();
                x[1] = randomCoordinate();
                x[2] = randomCoordinate();
                y[0] = randomCoordinate();
                y[1] = randomCoordinate();
                y[2] = randomCoordinate();
                name = "Triangle #" + (Math.round(Math.random()*100.0));

                theFigure = new Triangle(x,y,name);

                System.out.println(name + ", S = " + theFigure.getArea());
                break;
            }
        }
        return theFigure;
    }


}
