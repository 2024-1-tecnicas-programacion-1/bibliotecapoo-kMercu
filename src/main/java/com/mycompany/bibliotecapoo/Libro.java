package com.mycompany.bibliotecapoo;

public class Libro {
    private String title;
    private String genre;
    private String author;
    private int yearOfPublication;
    private boolean read;

    // Constructor de la clase
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public Libro(String title, String author, int yearOfPublication, String genre) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.read = false;
    }

    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String mostrarInformacion() {
        String impr = "Título: " + title + ", Autor: " + author + ", Año de publicación: " 
                + yearOfPublication + ", Leído: " + (read ? "Sí" : "No");
        return impr;
    }
    
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public void marcarLeido() {
        this.read = true;
    }
    
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public boolean getLeido(){
        return read;
    }
    
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public boolean esAntiguo() {
        if (yearOfPublication<1974){
        return true;
        } else {
        return false;
        }
    }
}