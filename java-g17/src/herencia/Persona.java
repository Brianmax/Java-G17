package herencia;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String codigo;

    public Persona(String nombre, String apellido, String email, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.codigo = codigo;
    }
    public Persona() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // print info
    public void printInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Codigo: " + codigo);
    }
}

//
