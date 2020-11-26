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
public class Toyota extends Loscoches {

    public Toyota(String N_coche, String Tipo_de_servicio, int Precio, String Alta_g_Baja_g) {
        super(N_coche, Tipo_de_servicio, Precio, Alta_g_Baja_g);
    }

    
     public void montrarDatos(){
      
        System.out.println("Nombre del coche 1: "+getN_coche());
        System.out.println("Tipo de servicio: "+getTipo_de_servicio());
        System.out.println("Precio del vehiculo: "+getPrecio());
        System.out.println("Gama del vehiculo: "+getAlta_g_Baja_g());
      
        System.out.println("");
        
        
    }
}
