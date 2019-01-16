package module3;

class TryCatch {

    static void tryCatch(){
        int q = 10;
        int w = 3;
        try {
            Thread.sleep(3000);
            System.out.println("\ntryCatch");
            System.out.println("Результат деления " + q / w);
            int zero = 5 / 0;
            System.out.println("Остаток от деления " + q % w);
        } catch (InterruptedException | ArithmeticException e) {
            System.out.println("You shall not fall!");
        }

    }

}
