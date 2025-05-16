import java.util.ArrayList;
import java.util.Scanner;

public class SistemaTransporte  {
    ArrayList<Usuario> usuarios = new ArrayList<>();
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
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1: iniciar sesion \n" +
                "2: registrar usuario \n"+
                "3: Salir");
        System.out.println("escoge una opcion :");
        Integer opcionMenu= (int) Double.parseDouble(teclado.next().trim().replace(",","."));
        if (opcionMenu.equals(2)){
            registrarUsuario();
        }
    }
    public void inicializarRutas(){

    }
    public void registrarUsuario(){
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Integer contadorUsuario=0;
        System.out.println("vamos a registrar su usuario ");
        System.out.println("ingrese su nombre ");
        usuario.setNombre(teclado.next());
        System.out.println("ingrese su documento de identidad ");
        usuario.setCedula(teclado.next());
        System.out.println("ingrese su edad ");
        usuario.setEdad(teclado.nextInt());
        System.out.println("Ingresa una contraseña ");
        usuario.setContraseña(teclado.next());
        usuarios.add(new Usuario());
        System.out.println();


    }
    public void mostrarUsuario(){
        System.out.println("Lista de usuarios registrados:");
        for (Usuario u : usuarios) {
            System.out.println(" Nombre: " + u.getNombre() + ", Cédula: " + u.getCedula() + ", Edad: " + u.getEdad());
        }
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
