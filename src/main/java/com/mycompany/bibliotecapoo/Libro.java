package com.mycompany.bibliotecapoo;

public class Libro {
    private String title;
    private String author;
    private int yearOfPublication;
    private String genre;
    private boolean read;

    // Constructor
    /**
     * Método para inicializar un libro.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public Libro(String title, String author, int yearOfPublication, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
        this.read = false;
    }

    /**
     * Método para mostrar la información del libro.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String mostrarInformacion() {
        String info = "Título: " + title + ", Autor: " + author + ", Año de publicación: " 
                + yearOfPublication + ", Género: " + genre;
        return info;
    }
    
    /**
     * Método para marcar el libro como leído.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public void marcarLeido() {
        this.read = true;
    }
    
    /**
     * Método para obtener el estado de lectura del libro.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public boolean getRead(){
        return read;
    }
    
    /**
     * Método para verificar si el libro es antiguo (más de 50 años de publicado).
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public boolean esAntiguo() {
        return yearOfPublication < 1974;
    }
}
