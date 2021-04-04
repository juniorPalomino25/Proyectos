
package Modelo;

public class Agencia {
    
    private final String ubicacion; //Departamento
    private final int telefono;
    //private final Empleado empleado;

    public Agencia(String ubicacion, int telefono) {
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        //this.empleado = empleado;
    }

    

    public String getUbicacion() {
        return ubicacion;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
    
}
