package Entidades;

public class Caballo {
    private String nombre;
    private String color;
    private int edad;

    public Caballo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El caballo " + nombre + ", es de color " + color + " y tiene " + edad + " años.";
    }

    
}
