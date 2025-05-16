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
    public void menuInicio(){
        System.out.println("¡¡BIENVENIDO A FUSAROUT!!");
        System.out.println("A continuación lo llevaremos a nuestro menú " +
                "\n 1: Iniciar sesión usuario");

    }

    public void inicializarRutas(){

    }
    public void registrarUsuario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("señor usuario, por favor registrese en Fusarout con su nombre completo");
        usuarios = Scanner.nextLine();

        usuarios.replaceAll(".",",");
        usuarios.toLowerCase();

    }
    public void mostrarUsuario(){
        System.out.println("----------------------------------------------------");
        System.out.println("¡PERFECTO! De acuerdo con la informacion tu nombre es "+usuarios);

    }
    public void añadirDestinoFavorito(){
        System.out.println("-------------------------------  ------------------");
        System.out.println("¿Desea agregar tu destino favorito?");

    }
    public void mostrarDestinosUsarios(){
        System.out.println("---------------------------------------------------");
        System.out.println("¿Desea agregar un destino?");

    }
    public void barriosMasVisitado(){
        System.out.println("---------------------------------------------------");
        System.out.println("El barrio mas visitado es: ");

    }
    public void calcularPromedioEdad(){
        System.out.println();

    }
    public void buscarRutaPorBarrios(){
        System.out.println("---------------------------------------------------");
        System.out.println("¿Desea buscar ruta por barrio?");


    }
    public void mostrarRutas(){

    }
    public void calificarRuta(){
        System.out.println("----------------------------------------------------");
        System.out.println("¿Quisiera calificar la ruta?Aa");

    }
    public void rutaMejorCalificada(){

    }

}
