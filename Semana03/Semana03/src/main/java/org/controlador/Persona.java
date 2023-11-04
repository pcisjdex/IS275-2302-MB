package org.controlador;

public abstract class Persona {


    //CReación de atributo
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //Crear un metodo abstracto
    public abstract int correr();

}
