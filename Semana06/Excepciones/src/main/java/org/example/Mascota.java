package org.example;

public class Mascota {
    private String documento;
    private String nombres;
    private int edad;
    private Historial historial;

    public Mascota(String documento, String nombres, int edad) {
        this.documento = documento;
        this.nombres = nombres;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }
}
