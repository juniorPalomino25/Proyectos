
package Modelo;

public class Producto {
    private String nombreProducto;
    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private int codigo;
    private String estado;
    public static int codigoProductos= 1000000000;
    private int valor;
    
    public Producto(String nombreProducto, double peso, double alto, double ancho, double largo, int valor) {
        this.nombreProducto = nombreProducto;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.codigo = codigoProductos;
        this.valor = valor;
        codigoProductos++;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPeso() {
        return peso;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

        

    public String getEstado() {
        return estado;
    }

    public static int getCodigoProductos() {
        return codigoProductos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void setCodigoProductos(int codigoProductos) {
        Producto.codigoProductos = codigoProductos;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    
    
    

    
    
   
    
}
