/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Peliculas.Netflix;
import Peliculas.Pelicula;

/**
 *
 * @author colsam-19
 */
public class PruebaNetflix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pelicula p1 = new Pelicula(1, "Peppa", 200, "Sexual");
       Pelicula p2 = new Pelicula(2, "Backyardigans", 520, "Accion");
        Netflix n = new Netflix();
        n.agregarPelicula(p1);
        n.agregarPelicula(p2);
       n.mostrarLista();
        System.out.println("la pelicula : " + p1.getNombre());
        System.out.println("tiene un genero "+ p1.getGenero() );
        System.out.println("-----------------------------------");
        System.out.println("la pelicula : " + p2.getNombre());
        System.out.println("tiene un genero "+ p2.getGenero() );
    }
    
}
