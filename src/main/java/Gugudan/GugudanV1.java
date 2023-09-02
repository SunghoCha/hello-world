package Gugudan;

public class GugudanV1 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            int[] ints = CalculGugudan(i);
            printGugudan(ints);
            System.out.println();
        }

    }

    public static int[] CalculGugudan(int k) {
        int[] ints = new int[9];
        for (int j = 1; j < 10; j++) {
            ints[j - 1] = k * j;
        }
        return ints;
    }

    public static void printGugudan(int[] a) {
        for (int j = 1; j < 10; j++) {
            System.out.println(a[j-1]);
        }
    }
}
