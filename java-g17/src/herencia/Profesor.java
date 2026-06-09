package herencia;

public class Profesor extends Persona{
    private float salario;

    Profesor(float salario, String nombre, String apellido, String email, String codigo) {
        super(nombre, apellido, email, codigo);
        this.salario = salario;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salario: " + salario);
    }

    @Override
    public String toString() {
            return "Profesor{" +
                    "salario=" + salario +
                    ", nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", email='" + email + '\'' +
                    ", codigo='" + codigo + '\'' +
                    '}';
    }

}
