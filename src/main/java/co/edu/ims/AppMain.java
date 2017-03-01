/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Pelicula;
import com.google.gson.Gson;

/**
 *
 * @author 1061713963
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula terminator = new Pelicula("Terminator", 1985);
        Pelicula insideOut = new Pelicula("Inside Out", 2015);

        Pelicula titanic = new Pelicula();
        titanic.setTitulo("titulo");
        titanic.setAnio(1996);

        Genero accion = new Genero("accion");
        Genero comedia = new Genero("Comedia");
        Genero animada = new Genero("Animada");
        Genero ficcion = new Genero("Ciencia Ficcion");

        terminator.getGeneros().add(ficcion);
        terminator.getGeneros().add(accion);

        insideOut.getGeneros().add(animada);
        titanic.getGeneros().add(accion);

        Gson gson = new Gson();
        String json = gson.toJson(terminator);

        System.out.println(json);

    }

}
