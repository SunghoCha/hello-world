package Gugudan;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanV1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[9];

        int i = Integer.parseInt(br.readLine());

        System.out.println(i + "단");
        for (int j = 1; j < 10; j++) {
            ints[j-1] = i * j;
        }

        for (int j = 1; j < 10; j++) {
            System.out.println(i + " x " + j + " = " + ints[j-1]);
        }
    }
}
