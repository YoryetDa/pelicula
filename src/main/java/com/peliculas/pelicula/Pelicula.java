package com.peliculas.pelicula;

import java.util.Date;

public class Pelicula {
    
    private int id;
    private String titulo;
    private int año;
    private String genero;
    private String director;
    private String sinopsis;

    // Constructor
    public Pelicula(int id, String titulo, int año, String genero, String director, String sinopsis){
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.genero = genero;
        this.director = director;
        this.sinopsis = sinopsis;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;  
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
