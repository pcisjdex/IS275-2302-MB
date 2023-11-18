package org.example;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    public List<Mascota> mascotas;

    //Una clinica veterinaria puede existir sin mascotas

    public Clinica() {
        this.mascotas = new ArrayList<>();
    }

    //Metodo Registrar Mascota
    public void registrarMascota(String documento, String nombres, int edad) {
        Mascota mascota = new Mascota(documento, nombres, edad);
        this.mascotas.add(mascota);
    }
}
