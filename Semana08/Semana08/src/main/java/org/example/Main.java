package org.example;

import org.controller.SoyUnico;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //SoyUnico soy = new SoyUnico("Luis");
        SoyUnico manuel  = SoyUnico.getSingletonInstance("Manuel");
        SoyUnico ramon  = SoyUnico.getSingletonInstance("Ramon");

        System.out.println(manuel.getNombre());
        System.out.println(ramon.getNombre());

    }
}