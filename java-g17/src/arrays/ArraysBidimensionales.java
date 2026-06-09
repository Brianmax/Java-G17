package arrays;

public class ArraysBidimensionales {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = {1, 2, 5, 6, 7, 8};
        double[] array3 = {2.23, 3.34, 23.544, 343.5};
        String[] array4 = {"George", "Maxi", "223"};
        int[][] array5 = {{23,4, 78}, {32,43}, {44, 99}};
        int[][] array6 = new int[3][4];
//        System.out.println(array5.length);

        for(int i = 0; i < array5.length; i++) {
            int tamSubArray = array5[i].length;
            for(int j = 0; j < tamSubArray; j++) {
                System.out.println(array5[i][j]);
            }
        }

        // declarar un array bidimensional de n * m
        // y llenarlo con numeros aleatorios
        // ejemplo (3, 4)
        // 3 4 3 1
        // 23 43 21 43
        // 2 8 5 9
        // print y println
    }
}
