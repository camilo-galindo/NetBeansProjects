/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author colsam-19
 */
public class Netflix {
  private ArrayList<Pelicula> listaPelicula = new ArrayList<>();

    public Netflix() {
    }
        public void agregarPelicula(Pelicula Macgyver){
          listaPelicula.add(Macgyver);  
        }
        
        public void eliminarPelicula(Pelicula Macgyver){
            listaPelicula.remove(Macgyver);
        }
                public void mostrarLista(){
                Iterator<Pelicula> elemento = listaPelicula.iterator();
                while(elemento.hasNext()){
                Pelicula Macgyver = elemento.next();
                    System.out.println(Macgyver.toString());
                }
                }
}
