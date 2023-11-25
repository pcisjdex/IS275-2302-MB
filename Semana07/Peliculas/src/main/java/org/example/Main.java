package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //RPTA A, RPTA B, RPTA C
        //1ro creado una tienda
        Tienda tienda = new Tienda("BlockBuster");
        //2do creamos la categoria
        //Categoria cat1;
        //Categoria cat2;
        try {
          Categoria cat1 = new Categoria("1","Documental");
          Categoria  cat2 = new Categoria("2","Documental");
            Pelicula peli1 = new Pelicula(1,"Scream 5",cat1);




        //3ero creamos la pelicula

        //peli1.agregarActor("Yena Ortega",);
        peli1.agregarActor(new Actor("Yena Ortega","USA"));
        peli1.agregarActor(new Actor("Actor 2","USA"));


        //4to agregar pelicula
        tienda.agregarPelicula(peli1);
        System.out.println(peli1.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}