package org.controller;

public class SoyUnico {
    private String nombre;
    private static SoyUnico soyUnico;
    //Metodos Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static SoyUnico getSoyUnico() {
        return soyUnico;
    }
    public static void setSoyUnico(SoyUnico soyUnico) {
        SoyUnico.soyUnico = soyUnico;
    }

    public SoyUnico(String nombre) {
        this.nombre = nombre;
    }
}
