package Modulo_de_Producto;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class Producto {

    private int codigo;
    private int codigoDelArticulo;
    private String nombre;
    private String tipo; 
    private String tamaño;
    private String marca;
    private int precio;
    private int cantidad;

    public Producto() {
        codigo = 1;
        codigoDelArticulo = 1;
        nombre = "";
        tipo = "";
        tamaño = "";
        marca = "";
        precio = 1;
        cantidad = 1;
                
                
    }
    
    
    
//Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoDelArticulo() {
        return codigoDelArticulo;
    }

    public void setCodigoDelArticulo(int codigoDelArticulo) {
        this.codigoDelArticulo = codigoDelArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamanio) {
        this.tamaño = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
//Getters and Setters
    
    private void generarCodigo(){
        setCodigo(codigo+1);
    }
    private String sinEspacios(String nombre){
        return nombre.trim();
    }
    
    
    public void buscar() {
        // código de búsqueda
    }

    public void agregar() {
        // código para agregar
    }

    public void modificar() {
        // código para modificar
    }

    public void eliminar() {
        // código para eliminar
    }

}
