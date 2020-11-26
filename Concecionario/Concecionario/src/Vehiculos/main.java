/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author EDWIN BALLEN
 */
public class main {
    
     public static void main(String[] args) {
         
     Toyota vh1 = new Toyota("Toyota hilux", "Publico", 130000000, "Gama alta");   
     Renault vh2 = new Renault("Renault Logan", "Privado", 30000000, "Gama Baja");   
          
     System.err.println("");
     vh1.montrarDatos();
     
     
     vh2.montrarDatos();
         
        
       
        
       
        
    }
}
