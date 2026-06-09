package arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(23);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains(39));

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(12);
        integers.add(43);

        int valor = integers.get(1);
        System.out.println(valor);

        // dado un array de n elementos, verificar si un numero m existe dentro del array
        // [12, 23, 23 5,3]   m = 12
        // true
        // m = 124 -> false
    }
}
