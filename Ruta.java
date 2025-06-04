import java.util.ArrayList;
import java.util.Scanner;

public abstract class  Ruta {
    protected String nombre;
    protected String rutaInicio;
    protected String rutaFinal;
    protected String tiempoEstimado;
    protected String informacion;
    protected String costo;

    Scanner teclado = new Scanner(System.in);

    public Ruta(){
    }
    public Ruta(String nombre, String rutaInicio, String rutaFinal, String tiempoEstimado, String informacion, String costo) {
        this.nombre = nombre;
        this.rutaInicio = rutaInicio;
        this.rutaFinal = rutaFinal;
        this.tiempoEstimado = tiempoEstimado;
        this.informacion = informacion;
        this.costo = costo;
    }


    public void mostarInfoRuta(){
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaInicio() {
        return rutaInicio;
    }

    public void setRutaInicio(String rutaInicio) {
        this.rutaInicio = rutaInicio;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getRutaFinal() {
        return rutaFinal;
    }

    public void setRutaFinal(String rutaFinal) {
        this.rutaFinal = rutaFinal;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
