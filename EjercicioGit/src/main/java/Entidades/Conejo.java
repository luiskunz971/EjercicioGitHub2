package main.java.Entidades;

public class Conejo {
    private String nombre;
    private Integer edad;

    public Conejo() {
    }

    public Conejo(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El Conejo " +
                "se llama: " + nombre + '\'' +
                ",y tiene " + edad +
                " años";
    }

    public void comerZanahoria(){
        System.out.println(nombre + "Comió su Zanahoria :)");
    }

}
