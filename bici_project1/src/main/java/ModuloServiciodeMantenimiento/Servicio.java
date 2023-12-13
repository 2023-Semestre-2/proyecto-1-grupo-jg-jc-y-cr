package ModuloServiciodeMantenimiento;

import ModulodeClientes.Cliente;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Servicio {
    
    private Cliente cliente;
    private int codigo;
    private int codigoCliente;
    private String marcaBicicleta;
    private String descripcionBicicleta;
    private double precio;
    private Date fechaRecibido;
    private Date fechaEntrega;
    private String observaciones;
    private boolean  estado;

    public Servicio(int codigo, int codigoCliente, String marcaBicicleta, String descripcionBicicleta, double precio, Date fechaRecibido, Date fechaEntrega, String observaciones, boolean estado) {
        this.codigo = codigo;
        this.codigoCliente = codigoCliente;
        this.marcaBicicleta = marcaBicicleta;
        this.descripcionBicicleta = descripcionBicicleta;
        this.precio = precio;
        this.fechaRecibido = fechaRecibido;
        this.fechaEntrega = fechaEntrega;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    private Servicio() {
        this.codigo = 0;
        this.codigoCliente = 0;
        this.marcaBicicleta = "";
        this.descripcionBicicleta = "";
        this.precio = 0.0;
        this.fechaRecibido = new Date();
        this.fechaEntrega = new Date();
        this.observaciones = "";
        this.estado = false;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDescripcionBicicleta() {
        return descripcionBicicleta;
    }

    public void setDescripcionBicicleta(String descripcionBicicleta) {
        this.descripcionBicicleta = descripcionBicicleta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public void setMarcaBicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static void guardarServicios(List<Servicio> servicios) {
        try (Writer writer = new FileWriter("servicios.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(servicios, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar servicios desde un archivo JSON
    public static List<Servicio> cargarServicios() {
        List<Servicio> servicios = new ArrayList<>();
        try (Reader reader = new FileReader("servicios.json")) {
            Gson gson = new Gson();
            Servicio[] serviciosArray = gson.fromJson(reader, Servicio[].class);
            if (serviciosArray != null) {
                servicios.addAll(Arrays.asList(serviciosArray));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return servicios;
    }
    // Método para agregar un servicio
    public static void agregarServicio(List<Servicio> servicios) {
        Servicio nuevoServicio = new Servicio();  
        servicios.add(nuevoServicio);
        guardarServicios(servicios);
    }

    // Método para buscar un servicio por código
    public static Servicio buscarServicio(List<Servicio> servicios, int codigo) {
        for (Servicio servicio : servicios) {
            if (servicio.getCodigo() == codigo) {
                return servicio;
            }
        }
        return null;
    }

    // Método para modificar un servicio
    public static void modificarServicio(List<Servicio> servicios, int codigo) {
        Servicio servicio = buscarServicio(servicios, codigo);
        if (servicio != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nueva descripción: ");
            String nuevaDescripcion = scanner.nextLine();
            servicio.setDescripcionBicicleta(nuevaDescripcion);

            guardarServicios(servicios);
        } else {
            System.out.println("Servicio no encontrado");
        }
    }

    // Método para eliminar un servicio
    public static void eliminarServicio(List<Servicio> servicios, int codigo) {
        Servicio servicio = buscarServicio(servicios, codigo);
        if (servicio != null) {
            servicios.remove(servicio);
            guardarServicios(servicios);
        } else {
            System.out.println("Servicio no encontrado");
        }
    }

}
