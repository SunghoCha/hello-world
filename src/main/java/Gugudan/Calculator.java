package Gugudan;

public class Calculator {
    public static int[] CalculGugudan(int k) {
        int[] ints = new int[9];
        for (int j = 1; j < 10; j++) {
            ints[j - 1] = k * j;
        }
        return ints;
    }
}
