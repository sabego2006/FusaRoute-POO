import java.util.ArrayList;
import java.util.Scanner;

public class SistemaTransporte {
    ArrayList<Usuario> usuarios;
    String [] ruta;
    String[] barrios = {"gaitan","encanto"};
    Integer cantidadRutas;
    ArrayList<String> rutas;
    public SistemaTransporte() {

    }

    public void inicializarRutasPredeterminadas() {
        // Rutas Urbanas
    }

//Métodos:

    public void escogerOpcionMenu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("escoge una opcion del menu ");
        Integer opcionMenuInicio=(int)Double.parseDouble(teclado.next().trim().replace(",","."));

    }

    public void inicializarRutas(){

    }
    public void registrarUsuario(){



    }
    public void mostrarUsuario(){

    }
    public void añadirDestinoFavorito(){

    }
    public void mostrarDestinosUsarios(){

    }
    public void barriosMasVisitado(){

    }
    public void calcularPromedioEdad(){

    }
    public void buscarRutaPorBarrios(){

    }
    public void mostrarRutas(){

    }
    public void calificarRuta(){

    }
    public void rutaMejorCalificada(){

    }

}
