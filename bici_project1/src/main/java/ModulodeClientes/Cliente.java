package ModulodeClientes;

import java.util.Date;

public class Cliente {

    private int código;
    private String nombre;
    private String apellidos;
    private int teléfono;
    private String correoElectrónico;
    private String provincia;
    private String cantón;
    private String distrito;
    private Date fechaNacimiento;

    public Cliente() {
        this.código = 0;
        this.nombre = "";
        this.apellidos = "";
        this.teléfono = 0;
        this.correoElectrónico = "";
        this.provincia = "";
        this.cantón = "";
        this.distrito = "";
        this.fechaNacimiento = new Date();
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public int getCódigo() {
        return this.código;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public int getTeléfono() {
        return this.teléfono;
    }

    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectrónico = correoElectrónico;
    }

    public String getCorreoElectrónico() {
        return this.correoElectrónico;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return this.provincia;
                }
    
}

