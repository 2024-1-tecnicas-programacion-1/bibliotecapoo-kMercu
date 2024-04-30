package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    
    public LinkedList<Libro> libros;
    
    public Biblioteca(){
        libros = new LinkedList<>();
    }
    
    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }
    
    public void buscarLibro(String palabraBusqueda){
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.mostrarInformacion().toLowerCase().contains(palabraBusqueda.toLowerCase())) {
                System.out.println(libro.mostrarInformacion());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }
    
    public void mostrarLibros(){
        
        // El is.empty en este caso lo utilice para saber si esta lista estaba vacia o no con un condicional
         if (libros.isEmpty()) {
         
            System.out.println("No hay libros registrados en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }
    
    public void mostrarLibrosNoLeidos(){
        boolean hayNoLeidos = false;
        for (Libro libro : libros) {
            if (!libro.getLeido()) {
                System.out.println(libro.mostrarInformacion());
                hayNoLeidos = true;
            }
        }
        if (!hayNoLeidos) {
            System.out.println("Todos los libros han sido leídos.");
        }
    }