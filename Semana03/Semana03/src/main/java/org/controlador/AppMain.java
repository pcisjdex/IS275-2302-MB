package org.controlador;

import java.util.Arrays;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

            Persona objPer1 = new Deportista("Jymmy");
            Persona objPer2 = new Deportista("Luis");
            Persona objPer3 = new Informatico("Maria");
            Persona objPer4 = new Informatico("Adela");

            //Listar las personas
            List<Persona> listaPersonas = Arrays.asList(objPer1,objPer2,objPer3,objPer4);

    }
}
