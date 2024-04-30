package com.mycompany.bibliotecapoo;

import java.util.Scanner;
import java.util.LinkedList;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1) Ingresar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("0) Salir");
            System.out.println("Seleccione una opción:");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    ingresarLibro(biblioteca, sc);
                    break;
                case 2:
                    mostrarLibros(biblioteca);
                    break;
                case 3:
                    buscarLibro(biblioteca, sc);
                    break;
                case 4:
                    marcarLibroLeido(biblioteca, sc);
                    break;
                case 5:
                    biblioteca.mostrarLibrosNoLeidos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 0);
        
        sc.close();
    }
    
    private static void ingresarLibro(Biblioteca biblioteca, Scanner sc) {
        System.out.println("Ingrese el título del libro:");
        String title = sc.nextLine();
        
        System.out.println("Ingrese el género del libro:");
        String genre = sc.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String author = sc.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int yearOfPublication = sc.nextInt();
        sc.nextLine();

        Libro libro = new Libro(title, author, yearOfPublication, genre);
        biblioteca.registrarLibro(libro);
        System.out.println("Libro registrado exitosamente.");
    }
    
    private static void mostrarLibros(Biblioteca biblioteca) {
        LinkedList<Libro> libros = biblioteca.libros;
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }
    
    private static void buscarLibro(Biblioteca biblioteca, Scanner sc) {
        System.out.println("Ingrese la palabra clave para buscar:");
        String palabraBusqueda = sc.nextLine();
        biblioteca.buscarLibro(palabraBusqueda);
    }
    
    private static void marcarLibroLeido(Biblioteca biblioteca, Scanner sc) {
        System.out.println("Ingrese el título del libro que desea marcar como leído:");
        String titulo = sc.nextLine();
        boolean encontrado = false;
        for (Libro libro : biblioteca.libros) {
            if (libro.mostrarInformacion().toLowerCase().contains(titulo.toLowerCase())) {
                libro.marcarLeido();
                encontrado = true;
                System.out.println("Libro marcado como leído correctamente.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }
}