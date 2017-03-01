/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import java.util.List;

/**
 *
 * @author 1061713963
 */
public class Pelicula {
    private String titulo;
    private int anio;
    private List<Genero>generos;
    
    public Pelicula(){
    
    }
    
    public Pelicula(String titulo, int anio){
        
    this.titulo= titulo;
    this.anio= anio;    
   // this.generos= generos;
    };

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }   
    
}
