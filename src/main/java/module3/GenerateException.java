package module3;

class GenerateException {

    static void generateException() throws InterruptedException, ArithmeticException {

        int q = 10;
        int w = 3;

        Thread.sleep(3000);
        System.out.println("\ngenerateException");
        System.out.println("Результат деления " + q / w);
        int zero = 5 / 0;
        System.out.println("Остаток от деления " + q % w);
        System.out.println("You shall not fall!");

    }

}
