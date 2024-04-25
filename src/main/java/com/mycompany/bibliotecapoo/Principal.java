package com.mycompany.bibliotecapoo;

import java.util.Scanner;


public class Principal {
    
    /**
    * Complejidad lineal: O(N) - Tiempo lineal.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String title = sc.nextLine();
        
        System.out.println("Ingrese el genero del libro:");
        String genre = sc.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String author = sc.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int yearOfPublication = sc.nextInt();


        Libro libro = new Libro(title, author, yearOfPublication, genre);
            libro.marcarLeido();

        System.out.println(libro.mostrarInformacion());
        System.out.println("¿El libro ha sido leído? " + (libro.getLeido() ? "Sí" : "No"));
        System.out.println("¿El libro es antiguo? " + (libro.esAntiguo() ? "Sí" : "No"));

        sc.close();
    }
}
