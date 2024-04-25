package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    
    private LinkedList<Libro> libros;
    
    public Biblioteca(){
        libros = new LinkedList<>();
    }
    
    
    
    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }
     
    public void buscarLibro(String palabraBusqueda){
        for (int i = 0; i < libros.size(); i++) {
            
        }
        
     
    }
    
    public void mostrarLibros(){
        libros.get(0);
        System.out.println(libros);
    }
    
    public void mostrarLibrosNoLeidos(){
        
    }
        
    
  
}
