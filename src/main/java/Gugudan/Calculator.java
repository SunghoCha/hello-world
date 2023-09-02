package Gugudan;

public class Calculator {
    public static int[] CalculGugudan(int a, int b) {
        int[] ints = new int[b];
        for (int j = 1; j < b+1; j++) {
            ints[j - 1] = a * j;
        }
        return ints;
    }
}
