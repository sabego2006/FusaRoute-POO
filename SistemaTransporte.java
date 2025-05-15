import java.util.Scanner;
import java.util.ArrayList;
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
    public void inicializarRutas(){

    }
    public void registrarUsuario(){
        System.out.println("---------------------------------------------------");
        System.out.println("señor usuario, por favor registrese en Fusarout con su nombre completo");
        usuarios = Scanner.nextLine();

        usuarios.replace(".",".");
        usuarios.toLowerCase();

    }
    public void mostrarUsuario(){
        System.out.println("----------------------------------------------------");
        System.out.println("¡PERFECTO! De acuerdo con la informacion tu nombre es "+usuarios);

    }
    public void añadirDestinoFavorito(){
        System.out.println("-------------------------------  ------------------");
        System.out.println("¿deseas agregar tu destino favorito?");

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
