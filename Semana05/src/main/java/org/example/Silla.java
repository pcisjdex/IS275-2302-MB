package org.example;
public class Silla {
    private Pata[] patas;
    private int numPatas =0;
    public Silla() {
        patas = new Pata[4];
    }
    //Metodo para agregar Pata
    public void agregarPata(String color, float peso) {
        patas[numPatas] = new Pata(color,peso);
        this.numPatas++;
    }
    public int getNumPatas() {
        return numPatas;
    }
}
