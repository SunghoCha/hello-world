package Gugudan;

public class Printer {
    public static void printGugudan(int[] a, int b) {
        for (int j = 1; j < b+1; j++) {
            System.out.println(a[j-1]);
        }
    }
}
