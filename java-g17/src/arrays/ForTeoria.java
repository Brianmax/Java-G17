package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForTeoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos");
        int n = sc.nextInt();
        int[] numeros = new int[n];


        // generando numeros aleatorios
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(15, 31);
        }

        System.out.println(Arrays.toString(numeros));
//        System.out.println(numeros[0]);
//        System.out.println(numeros[3]);

        int mayores = 0;
//        for(int i = 0; i < n; i++) {
//            int edad = numeros[i];
//            if(edad > 18) {
//                mayores++;
//            }
//        }
        for(int edad: numeros) {
            if(edad >= 18) {
                mayores++;
            }
        }
        System.out.println("Hay " + mayores + " personas mayores de edad");


        // declarar un array de n elementos y encontrar el valor maximo

        // Declarar un array de n elementos y imprimir la suma total
        // {1, 3, 4, 5} ==> 13
    }
}
