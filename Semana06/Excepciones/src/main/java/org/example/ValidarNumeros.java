package org.example;

import java.util.Scanner;

public class ValidarNumeros {
    public static void main(String[] args) {
    //Crear un programa que me permita validar numeros
        Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresar un numero");
            int input  = scanner.nextInt();
            System.out.println("Numero ingresado es: " + input);

    }
}
