package poo;

public class Perro {
    // atributos
    private String nombre;
    private int edad;

    public Perro() {

    }

    Perro(String nombre, int edad) {
        this.nombre = nombre;
    }

    // getter

    String getNombre() {
        return nombre;
    }
    int getEdad() {
        return edad;
    }

    // setter

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setEdad(int edad) {
        this.edad = edad;
    }


    void ladrar() {
        System.out.println("Guau guau");
    }

    void ladrarPersona(String nombre) {
        System.out.println("Guau guau " + nombre);
    }

}

// Crear una clase Computer con los siguientes atributos:
//
//  de tipo String
// modelo de tipo String
// ram de tipo int
// almacenamiento de tipo int

// crear tres objetos y imprimir los atributos de cada uno

// Crear el constructor y definir algunos objetos

// Agregar los metodos getter y setter