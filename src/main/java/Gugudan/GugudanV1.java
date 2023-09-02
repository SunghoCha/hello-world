package Gugudan;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanV1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0 ;
        do {
            i = Integer.parseInt(br.readLine());

        } while (  i < 2 || i > 9 );

        System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();

    }
}
