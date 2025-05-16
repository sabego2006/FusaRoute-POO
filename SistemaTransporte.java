import java.util.ArrayList;
import java.util.Scanner;

public class SistemaTransporte  {
    ArrayList<Usuario> usuarios ;
    String [] ruta;
    Integer cantidadRutas;
    ArrayList<String> rutas;
    public SistemaTransporte() {

    }

    public void inicializarRutasPredeterminadas() {
        // Rutas Urbanas
    }

//Métodos:
    public void menuInicio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¡BIENVENIDO A FUSAROUTS! \n continuación lo llevaremos a nuestro menú ");
        System.out.println("1: iniciar sesion usuario \n" +
                "2: registrar usuario \n" +
                "3: inicar sesion administrador \n" +
                "4: registrar Administrador");
        System.out.println("escoge una opcion :");
        Integer opcionMenu= (int) Double.parseDouble(teclado.next().trim().replace(",","."));
        if (opcionMenu.equals(1)){
            registrarUsuario();
        }
    }
    public void inicializarRutas(){

    }
    public void registrarUsuario(){
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.out.println("vamos a registrar su usuario ");
        System.out.println("ingrese su nombre ");
        usuario.setNombre(teclado.next());
        System.out.println("ingrese su documento de identidad ");
        usuario.setCedula(teclado.next());
        System.out.println("ingrese su edad ");
        usuario.setEdad(teclado.nextInt());
        System.out.println("Ingresa una contraseña ");
        usuario.setContraseña(teclado.next());

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
