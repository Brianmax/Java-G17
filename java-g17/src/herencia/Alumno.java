package herencia;

public class Alumno extends Persona{
    private double promedio;

    public Alumno(double promedio, String nombre, String apellido, String email, String codigo) {
        super(nombre, apellido, email, codigo);
        this.promedio = promedio;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Promedio: " + promedio);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "promedio=" + promedio +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

}
