package main.java.Entidades;

public class Pato {
    private String nombre;
    private String especie;
    private int edad;
    private boolean volando;

    // Constructor
    public Pato(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.volando = false;
    }


    public void volar() {
        if (!volando) {
            System.out.println(nombre + " está volando.");
            volando = true;
        } else {
            System.out.println(nombre + " ya está volando.");
        }
    }

    public void aterrizar() {
        if (volando) {
            System.out.println(nombre + " ha aterrizado.");
            volando = false;
        } else {
            System.out.println(nombre + " ya está en el suelo.");
        }
    }

    public void obtenerInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estado: " + (volando ? "Volando" : "En el suelo"));
    }


}
