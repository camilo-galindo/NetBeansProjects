/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import static javafx.scene.paint.Color.color;

/**
 *
 * @author colsam-19
 */
public class pruebaclase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Carro Carro1 = new Carro("mazda", "3", "plateado", 0);
      Carro Carro2 = new Carro ("chrevolet", "2", "amarillo franja negra", 0);
        System.out.println("El carro :" + Carro2.getMarca() 
        + "Tiene un kilometraje de:" + Carro2.getkm());
        
        Carro2.añadirkm (50000) ;
        System.out.println("-----------------------------");
        System.out.println("El carro : " + Carro2.getMarca()
        + "tiene un kilometraje de : " + Carro2.getkm());
        
        
        System.out.println("---------------");
        Carro2.setColor ("morado") ;
        System.out.println("el color : " + Carro2.getMarca()
        + "tiene color de :" + Carro2.getColor());
        
        System.out.println(Carro2.toString());
    }
    
}




