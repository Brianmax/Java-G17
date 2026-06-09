package ejercioComputer;

public class Computer {
    private String marca;
    private String modelo;
    private int ram;
    private int almacenamiento;

    public Computer(String marca, String modelo, int ram, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public Computer() {}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }


    public void printInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
    }

    // crear un metodo que aumente la memoria ram de una computadora
    // como argumento de entrada se debe de enviar la cantidad a aumentar
    // eg
    // 16 RAM
    // entrada -> 8
    // nueva ram = 24 (16 + 8)
    // imprimir la nueva cantidad de ram
}
