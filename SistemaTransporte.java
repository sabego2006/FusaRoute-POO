import java.util.ArrayList;
import java.util.Scanner;

public class SistemaTransporte  {

    Scanner teclado = new Scanner(System.in);

    ArrayList<Usuario> usuarios = new ArrayList<>();
    Integer cantidadRutas;
    ArrayList<RutaUrbana> rutasUrbanas;

    ArrayList<RutaInterMunicipal> rutasInterMunicipales= new ArrayList<>();

//cambio auqi
    Integer contadorUsuario = 0;
    public SistemaTransporte() {

    }


    public void menuMostrarRutaIntermunicipal(Scanner teclado) {
        if (rutasInterMunicipales.isEmpty()) {
            System.out.println("No hay rutas intermunicipales registradas.");
            return;
        }


        System.out.println("=== RUTAS INTERMUNICIPALES ===");
        for (int i = 0; i < rutasInterMunicipales.size(); i++) {
            System.out.println(i + ". " + rutasInterMunicipales.get(i).getDestino());
        }

        System.out.print("Seleccione una ruta: ");
        int opcion = teclado.nextInt();
        teclado.nextLine();

        if (opcion >= 0 && opcion < rutasInterMunicipales.size()) {
            RutaInterMunicipal ruta = rutasInterMunicipales.get(opcion);
            ruta.mostrarInfoRuta(); // 🔥 POLIMORFISMO aquí
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public void inicializarRutasPredeterminadas() {
        // Rutas Urbanas
    }

//Métodos:
static Integer validarCase(Integer opcionRuta){
    Scanner teclado = new Scanner(System.in);
    if (opcionRuta>2 || opcionRuta<=0){
        while (opcionRuta>2 || opcionRuta<=0){
            System.out.println(", vuelelo a intentar");
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
        switch (opcionMenu){
            case 1:
                registrarUsuario();
                break;
            case 2:
                registrarUsuario();
                break;
            case 3:
                break;
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
            System.out.println("ingresa tu barrio de recidencia ");
            usuario.setBarrioDeResidencia(teclado.next());
            usuarios.add(usuario);
            contadorUsuario+=1;
    }
    public void iniciarSesionUsario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Iniciar sesión");

        System.out.print("Ingrese su cédula: ");
        String cedula = teclado.next().trim();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = teclado.next().trim();

        boolean encontrado = false;

        for (Usuario usuario : usuarios) {
            if (usuario.getCedula().equals(cedula) && usuario.getContraseña().equals(contraseña)) {
                System.out.println("¡Bienvenido/a " + usuario.getNombre() + "!");
                encontrado = true;


                break;
            }
        }

        if (!encontrado) {
            System.out.println("⚠️ Cédula o contraseña incorrecta. Inténtelo nuevamente.");
        }
    }

    public void salirOnoSistema(){
        Integer opcionSistema=0;
        while (opcionSistema!=2){
            System.out.println("desea salir del sistema? \n" +
                    "1: no \n" +
                    "2: si");
            opcionSistema=(int)Double.parseDouble(teclado.next().replace(",","."));
            switch (opcionSistema){
                case 1:
                    menuInicio();
                    break;
                case 2:
                    break;
            }
        }
    }

    public void mostrarUsuario(){
        System.out.println("hay un total de "+contadorUsuario + " Usuarios ");
        System.out.println("Lista de usuarios registrados:");
        for (Usuario us : usuarios) {
            System.out.println(" Nombre: " + us.getNombre() + ", Cédula: " + us.getCedula() + ", Edad: " + us.getEdad());
        }
    }

    public void menuUsuario(){

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

