import java.util.ArrayList;
import java.util.Scanner;

public abstract class  Ruta {
    protected String nombreRuta;
    protected ArrayList<String> paraderos;
    protected String horaInicio;
    protected String horaFin;
    protected ArrayList<Integer> calificacionesRutas;

    Scanner teclado = new Scanner(System.in);

    public Ruta(){


    }
    public Ruta(String nombreRuta, ArrayList<String>paraderos, String horaInicio, String horaFin, ArrayList<Integer> calificacionesRutas ){
        this.nombreRuta=nombreRuta;
        this.paraderos=paraderos;
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;
        this.calificacionesRutas=calificacionesRutas;
    }
    public void agregarCalificacion(){
        System.out.println("Califique su experiencia del 1-5 ⭐⭐⭐⭐⭐ ");
    }
    public void promedioCalificaciones(){
    }
    public void mostarInfoRuta(){

    }


}
