
package Vehiculos;


public class Loscoches {
     String N_coche;
    String Tipo_de_servicio;
    int Precio;
    String Alta_g_Baja_g;

    public Loscoches(String N_coche, String Tipo_de_servicio, int Precio, String Alta_g_Baja_g) {
        this.N_coche = N_coche;
        this.Tipo_de_servicio = Tipo_de_servicio;
        this.Precio = Precio;
        this.Alta_g_Baja_g = Alta_g_Baja_g;
          
    }

    public void setN_coche(String N_coche) {
        this.N_coche = N_coche;
    }

    public void setTipo_de_servicio(String Tipo_de_servicio) {
        this.Tipo_de_servicio = Tipo_de_servicio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setAlta_g_Baja_g(String Alta_g_Baja_g) {
        this.Alta_g_Baja_g = Alta_g_Baja_g;
    }

    public String getN_coche() {
        return N_coche;
    }

    public String getTipo_de_servicio() {
        return Tipo_de_servicio;
    }

    public int getPrecio() {
        return Precio;
    }

    public String getAlta_g_Baja_g() {
        return Alta_g_Baja_g;
    }

    
    
    
}

