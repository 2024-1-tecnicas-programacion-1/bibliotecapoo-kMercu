package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    
    public LinkedList<Libro> libros;
    
    // Constructor
    /**
     * Método para inicializar la biblioteca.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public Biblioteca(){
        libros = new LinkedList<>();
    }
    
    /**
     * Método para registrar un libro en la biblioteca.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public void registrarLibro(Libro book) {
        libros.add(book);
    }
    
    /**
     * Método para buscar un libro por una palabra clave.
     * Complejidad temporal: O(N) - Tiempo lineal.
     */
    public void buscarLibro(String keyword){
        boolean encontrado = false;
        for (Libro book : libros) {
            if (book.mostrarInformacion().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book.mostrarInformacion());
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }
    
    /**
     * Método para mostrar todos los libros de la biblioteca.
     * Complejidad temporal: O(N) - Tiempo lineal.
     */
    public void mostrarLibros(){
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados en la biblioteca.");
        } else {
            for (Libro book : libros) {
                System.out.println(book.mostrarInformacion());
            }
        }
    }
    
    /**
     * Método para mostrar los libros no leídos de la biblioteca.
     * Complejidad temporal: O(N) - Tiempo lineal.
     */
    public void mostrarLibrosNoLeidos(){
        boolean noHayLeidos = false;
        for (Libro book : libros) {
            if (book.getRead()) {
                System.out.println(book.mostrarInformacion());
                noHayLeidos = true;
            }
        }
        if (noHayLeidos) {
            System.out.println("Todos los libros han sido leídos.");
        }
    }
}
