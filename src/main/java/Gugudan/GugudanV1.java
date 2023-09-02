package Gugudan;

public class GugudanV1 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {

            int[] ints = Calculator.CalculGugudan(i);
            Printer.printGugudan(ints);
            System.out.println();
        }

    }

}
