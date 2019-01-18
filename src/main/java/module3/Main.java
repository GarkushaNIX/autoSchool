package module3;

public class Main {

    public static void main(String[] args) {
        TryCatch.tryCatch();
        try {
            GenerateException.generateException();
        } catch (InterruptedException | ArithmeticException e) {
            System.out.println("You shall not fall!");
        }

    }

}
