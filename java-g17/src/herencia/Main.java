package herencia;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor(
                1000,
                "George",
                "Maxi",
                "georgemaxi@ravn.co",
                "TC238844"
        );
        Alumno alumno = new Alumno(
                9.5,
                "Maria",
                "Perez",
                "jose@gmail.com",
                "TC32323");
        alumno.printInfo();

        profesor.printInfo();

       Persona persona1 = new Profesor(
               1299,
               "Juan",
               "Perez",
               "jperez@gmail.com",
               "TC23999"
       );

       Persona persona2 = new Alumno(
               8.5,
               "Ana",
               "Gomez",
               "agomez@jjdjd.com",
               "TC---9934");

        System.out.println("=====================================");
        persona1.printInfo(); // imprimira el salario ?
        persona2.printInfo(); // imprimira el promedio ?
        System.out.println("==================================");
        System.out.println(persona1);
    }
}
