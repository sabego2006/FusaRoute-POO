import java.util.ArrayList;
import java.util.Scanner;

public class SistemaTransporte  {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    String [] ruta;
    Integer cantidadRutas;
    ArrayList<String> rutas;
    Integer contadorUsuario=0;
    public SistemaTransporte() {

    }

    public void inicializarRutasPredeterminadas() {
        // Rutas Urbanas
    }

//Métodos:
static Integer validarCase(Integer opcionRuta){
    Scanner teclado = new Scanner(System.in);
    if (opcionRuta>2 || opcionRuta<=0){
        while (opcionRuta>2 || opcionRuta<=0){
            System.out.println("numero incorrecot, vuelelo a intentar");
            opcionRuta=(int)Double.parseDouble(teclado.next().trim().replace(",","."));
        }
    }
    return opcionRuta;
}

    public void escogerTipodeRuta(){
        RutaUrbana rutitaUrbanita = new RutaUrbana();
        RutaInterMunicipal rutitaInMunicipal = new RutaInterMunicipal();
        Scanner teclado = new Scanner(System.in);
        System.out.println("tipos de ruta \n 1: urbana \n 2: intermunicipal");
        Integer opcionRuta= (int)Double.parseDouble(teclado.next().trim().replace(",","."));
        if (opcionRuta>2 || opcionRuta<=0){
            opcionRuta = validarCase(opcionRuta);
        }
        switch (opcionRuta){
            case 1:
                rutitaUrbanita.nombreComunas();
                rutitaUrbanita.barrioComuna();
                break;
            case 2:
                rutitaInMunicipal.nombreRutasIntermunicipales();
                rutitaInMunicipal.mostrarInforRutasIntermunicipal();
                break;
        }
    }
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
        if ((opcionMenu.equals(3))){
            return;
        }
    }
    public void inicializarRutas(){

    }
    public void registrarUsuario(){
        Scanner teclado = new Scanner(System.in);


        for (int i=0; i<2; i++){
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
            System.out.println("ingresa tu barrio de recidencia ");
            usuario.setBarrioDeResidencia(teclado.next());
            usuarios.add(usuario);
            contadorUsuario+=1;
        }




    }
    public void mostrarUsuario(){
        System.out.println("hay un total de "+contadorUsuario + " Usuarios ");
        System.out.println("Lista de usuarios registrados:");
        for (Usuario us : usuarios) {
            System.out.println(" Nombre: " + us.getNombre() + ", Cédula: " + us.getCedula() + ", Edad: " + us.getEdad());
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
