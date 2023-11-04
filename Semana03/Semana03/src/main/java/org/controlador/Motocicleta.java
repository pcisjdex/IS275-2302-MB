package org.controlador;

public class Motocicleta {

    //Medodo para calcular el precioBase
    public int precioBase(String tipo) {
        int precio=0;
        if (tipo=="Scooter") {
            precio=5000;
        } else if (tipo=="Cross") {
            precio=8000;
        } else {
            precio=12000;
        }

        return precio;
    }
}
