import java.util.ArrayList;
import java.util.Scanner;

// clase principal
public class SistemaTransporte {

    Administrador administrador = new Administrador("Frank Ortegon","123",26,"udec");
    Usuario usuario = new Usuario();
    Scanner teclado = new Scanner(System.in);
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<RutaUrbana> rutasUrbanas;
    ArrayList<RutaInterMunicipal> rutasInterMunicipales = new ArrayList<>();
    ArrayList<String> destinosFrecuentes = new ArrayList<>();
    ArrayList<Integer> frecuenciaDestinos = new ArrayList<>();
    RutaUrbana rutaUrbana = new RutaUrbana();
    RutaInterMunicipal rutaInterMunicipal = new RutaInterMunicipal();
    //Contructor vacio
    public SistemaTransporte() {
    }

    static Integer validarCase(Integer opcionRuta) {
        Scanner teclado = new Scanner(System.in);
        if (opcionRuta > 2 || opcionRuta <= 0) {
            while (opcionRuta > 2 || opcionRuta <= 0) {
                System.out.println(", vuelelo a intentar");
                opcionRuta = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
            }
        }
        return opcionRuta;
    }

    //Métodos:
    public void agregarDestino(String destino) {
        if (destinosFrecuentes.contains(destino)) {
            int index = destinosFrecuentes.indexOf(destino);
            int frecuenciaActual = frecuenciaDestinos.get(index);
            frecuenciaDestinos.set(index, frecuenciaActual + 1);
        } else {
            destinosFrecuentes.add(destino);
            frecuenciaDestinos.add(1);
        }

        System.out.println("Destino registrado: " + destino);
    }

    public void mostrarDestinosConFrecuencia() {
        for (Usuario us : usuarios) {
            System.out.println("=== Destinos frecuentes de " +  us.getNombre() + " ===");
        }
        for (int i = 0; i < destinosFrecuentes.size(); i++) {
            System.out.println(destinosFrecuentes.get(i) + " → Veces: " + frecuenciaDestinos.get(i));
        }
    }



    public void inicializarRutasInterMunicipales() {
        rutasInterMunicipales.add(new RutaNovillero());
        rutasInterMunicipales.add(new RutaPasca());
        rutasInterMunicipales.add(new RutaChinauta());
        rutasInterMunicipales.add(new RutaSilvania());
        rutasInterMunicipales.add(new RutaArbelaez());
    }

    public void inicializarRutasUrbanas() {
        rutasUrbanas.add(new RutaCentroTerminal());
        rutasUrbanas.add(new RutaGranColombia());
        rutasUrbanas.add(new RutaPampa());
        rutasUrbanas.add(new RutaSanFernando());
        rutasUrbanas.add(new RutaStaMariaLosAngeles());
    }
    public void inicializarRutas() {
        inicializarRutasUrbanas();
        inicializarRutasInterMunicipales();
    }



    public void mostrarRutaPorComuna(int opcionComuna) {
        RutaUrbana ruta = new RutaUrbana();
        switch (opcionComuna) {
            case 1:
                ruta = new RutaCentroTerminal();
                agregarDestino("RutaCentroTerminal");
                break;
            case 2:
                ruta = new RutaPampa();
                agregarDestino("RutaPampa");
                break;
            case 3:
                ruta = new RutaGranColombia();
                agregarDestino("RutaGranColombia");
                break;
            case 4:
                ruta = new RutaStaMariaLosAngeles();
                agregarDestino("RutaStaMariaLosAngeles");
                break;
            case 5:
                ruta = new RutaPampa();
                agregarDestino("RutaPampa");
                break;
            case 6:
                ruta = new RutaSanFernando();
                agregarDestino("RutaSanFernando");
                break;
            default:
                System.out.println("Comuna inválida.");
                return;
        }

        System.out.println("\n=== Ruta recomendada para esta comuna ===");
        ruta.mostrarInfoRuta();
    }

    public void menuAdmin() {
        Integer opcionz=0;
        while (opcionz!=2){
            Scanner teclado = new Scanner(System.in);
            System.out.println("===== MENÚ ADMINISTRADOR =====");
            System.out.println("1. Ver usuarios registrados");
            System.out.println("2. Ver estadísticas de rutas");
            System.out.println("3. Salir Sesion");

            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    mostrarUsuario();
                    break;
                case 2:
                    mostrarDestinosConFrecuencia();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.println("desea realizar otra opcion? \n 1: si " +
                    "\n 2: no");
            opcionz = (int) Double.parseDouble(teclado.next());
        }
        salirOnoSistema();

    }

    public void menuMostrarRutaIntermunicipal() {

        if (rutasInterMunicipales.isEmpty()) {
            System.out.println("No hay rutas intermunicipales registradas.");
            return;
        }

        System.out.println("=== RUTAS INTERMUNICIPALES ===");
        for (int i = 0; i < rutasInterMunicipales.size(); i++) {
            System.out.println((i+1) + ". " + rutasInterMunicipales.get(i).getNombre());
        }
//
//        System.out.print("Seleccione una ruta: ");
//        int opcion = teclado.nextInt();
//        teclado.nextLine();
//
//        if (opcion >= 0 && opcion < rutasInterMunicipales.size()) {
//            RutaInterMunicipal ruta = rutasInterMunicipales.get(opcion);
//            ruta.mostrarInfoRuta(); // 🔥 POLIMORFISMO aquí
//        } else {
//            System.out.println("Opción inválida.");
//        }
    }



    public void escogerTipodeRuta() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("tipos de ruta \n 1: urbana \n 2: intermunicipal");
        Integer opcionRuta = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        if (opcionRuta > 2 || opcionRuta <= 0) {
            opcionRuta = validarCase(opcionRuta);
        }
        switch (opcionRuta) {
            case 1:
                rutaUrbana.nombreComunas();
                rutaUrbana.barrioComuna();
                mostrarRutaPorComuna(opcionRuta);
                break;
            case 2:
                menuMostrarRutaIntermunicipal();
                rutaInterMunicipal.mostrarInforRutasIntermunicipal();
                inicializarRutasInterMunicipales();
                break;
        }
    }

    public void menuInicio() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¡BIENVENIDO A FUSAROUTE! \n continuación lo llevaremos a nuestro menú ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1: iniciar sesion \n" +
                "2: registrar usuario \n" +
                "3: Salir de la sesion ");
        System.out.println("escoge una opcion :");
        Integer opcionMenu = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        System.out.println("------------------");
        switch (opcionMenu) {
            case 1:
                iniciarSesionUsuario();
                break;
            case 2:
                registrarUsuario();
                escogerTipodeRuta();
                break;
            case 3:
                break;
        }
    }

    public void registrarUsuario() {
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.out.println("vamos a registrar su usuario ");
        System.out.print("ingrese su nombre: ");
        usuario.setNombre(teclado.next());
        System.out.print("ingrese su documento de identidad: ");
        usuario.setCedula(teclado.next());
        System.out.print("ingrese su edad: ");
        usuario.setEdad(teclado.nextInt());
        System.out.print("Ingrese una contraseña: ");
        usuario.setContraseña(teclado.next());
        System.out.print("ingresa tu barrio de residencia: ");
        usuario.setBarrioDeResidencia(teclado.next());
        usuarios.add(usuario);
    }

    public void iniciarSesionUsuario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Iniciar sesión");

        System.out.print("Ingrese su cédula: ");
        String cedula = teclado.nextLine().trim();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = teclado.nextLine().trim();
        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getCedula().equals(cedula) && usuario.getContraseña().equals(contraseña)) {
                System.out.println("Bienvenido " + usuario.getNombre());
                menuUsuario();
                encontrado = true;

            } else {
                System.out.println("");
            }
            if (administrador.getCedula().equals(cedula) && administrador.getContraseña().equals(contraseña)) {
                System.out.println("✅ Bienvenido Administrador: " + administrador.getNombre());
                menuAdmin();
            } else if (administrador.getCedula().equals(cedula) != administrador.getContraseña().equals(contraseña) && !encontrado) {
                System.out.println("❌ Cédula o contraseña incorrecta. Acceso denegado.");
            }
        }

    }

    public void salirOnoSistema() {
        Integer opcionSistema = 0;
        while (opcionSistema != 2) {
            System.out.println("desea salir del sistema? \n" +
                    "1: no \n" +
                    "2: si");
            opcionSistema = (int) Double.parseDouble(teclado.next().replace(",", "."));
            switch (opcionSistema) {
                case 1:
                    menuInicio();
                    break;
                case 2:
                    break;
            }
        }
    }

    public void mostrarUsuario() {
        System.out.println("hay un total de " + usuarios.size() + " Usuarios ");
        System.out.println("Lista de usuarios registrados:");
        for (Usuario us : usuarios) {
            System.out.println(" Nombre: " + us.getNombre() + ", Cédula: " + us.getCedula() + ", Edad: " + us.getEdad());
        }
    }

    public ArrayList<RutaInterMunicipal> getRutasInterMunicipales() {
        return rutasInterMunicipales;
    }

    public void setRutasInterMunicipales(ArrayList<RutaInterMunicipal> rutasInterMunicipales) {
        this.rutasInterMunicipales = rutasInterMunicipales;

    }

    public void menuUsuario() {
        Scanner teclado = new Scanner(System.in);
        //Usuario ultimo = usuarios.get(usuarios.size() - 1);
        //System.out.println("¡Bienvenido/a " +  ultimo.getNombre() + "!");

        System.out.println("1: iniciar ruta \n" +
                "2: salir Sesion ");
        Integer opcion= (int)Double.parseDouble(teclado.next());
        switch (opcion){
            case 1:
                escogerTipodeRuta();
                break;
            case 2:
                break;
        }

    }

    public void añadirDestinoFavorito() {

    }

    public void mostrarDestinosUsarios() {

    }

    public void barriosMasVisitado() {

    }

    public void calcularPromedioEdad() {

    }

    public void buscarRutaPorBarrios() {

    }

    public void mostrarRutas() {

    }

    public void calificarRuta() {

    }

    public void rutaMejorCalificada() {

    }

}
