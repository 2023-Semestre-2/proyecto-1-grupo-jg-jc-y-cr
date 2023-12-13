/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo_de_Producto;

/**
 *
 * @author PC
 */
public class TipoDeProducto {
    private int codigo;
    private String nombre;

    public TipoDeProducto(String nombre) {
        codigo = 1;
        setNombre(nombre);
    }
    
    //Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Final de Getters and Setters 
    
    private void generarCodigo(){
        setCodigo(codigo+1);
    }
    private String sinEspacios(String nombre){
        return nombre.trim();
    }
    
    
    
    
}
