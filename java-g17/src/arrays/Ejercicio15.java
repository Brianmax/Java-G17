package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int n = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        Random random = new Random();
        for(int i = 0; i < n; i++) {
           for(int j = 0; j < m; j++) {
               matriz[i][j] = random.nextInt(100);
           }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
