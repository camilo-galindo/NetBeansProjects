/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author colsam-19
 */
public class Carro {
    private String marca ;
    private String modelo ;
    private String color ;
    private int km ;

    public Carro(String marca, String modelo, String color, int kl) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.km = km;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getkm() {
        return km;
    }

    public void setkm(int kl) {
        this.km = kl;
    }
   
    

 
public  void añadirkm(int maskm) {
        km = km + maskm; 
} 

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", km=" + km + '}';
    }



}
