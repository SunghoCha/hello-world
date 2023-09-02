package Gugudan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GugudanV1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 2; i < a+1; i++) {

            int[] ints = Calculator.CalculGugudan(i,b);
            Printer.printGugudan(ints, b);
            System.out.println();
        }

    }

}
