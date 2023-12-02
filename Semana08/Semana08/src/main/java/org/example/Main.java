package org.example;

import org.controller.Conexion;
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

        //PAra trabajar con la clase Conexion
        Conexion cn = Conexion.getConexion("192.168.1.1","alma");
        System.out.println(cn.getHost());
        System.out.println(cn.getBaseDatos());
        cn.setHost("192.168.2.1");
        System.out.println(cn.getHost());




    }
}