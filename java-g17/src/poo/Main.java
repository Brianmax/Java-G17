package poo;

public class Main {
    public static void main(String[] args) {
        Perro rex = new Perro();
        // rex.nombre = "Rex";
        rex.setNombre("Rex");
        // rex.edad = 8;
        rex.setEdad(8);

        Perro fido = new Perro();
        // fido.nombre = "Fido";
        fido.setNombre("Fido");
        // fido.edad = 4;
        fido.setEdad(4);

        System.out.println("El nombre del perro es: " + rex.getNombre());
        System.out.println("La edad del perro es: " + rex.getEdad());

//        rex.ladrar();

//        fido.ladrar();

        rex.ladrarPersona("George");

        fido.ladrarPersona("Jose");

        Calculadora calculadora1 = new Calculadora();
        calculadora1.marca = "Casio";

        int resultadoSuma = calculadora1.sumar(1,4);
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        // Crear objeto de la clase persona
        Persona persona = new Persona("George", 12);
//        persona.nombre = "George";
//        persona.edad = 12;

        Persona persona2 = new Persona("Jose");

        Persona persona3 = new Persona(44);

        Persona persona4 = new Persona();



        // Diferencias entre public, private y default

        Perro perro1 = new Perro();

    }
}
