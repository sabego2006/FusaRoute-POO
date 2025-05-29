import java.util.ArrayList;
import java.util.Scanner;


public class SistemaTransporte {

    Administrador administrador = new Administrador("Frank Ortegon", "123", 26, "udec");
    Scanner teclado = new Scanner(System.in);
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<RutaUrbana> rutasUrbanas;
    ArrayList<RutaInterMunicipal> rutasInterMunicipales = new ArrayList<>();
    ArrayList<String> destinosFrecuentes = new ArrayList<>();
    ArrayList<Integer> frecuenciaDestinos = new ArrayList<>();
    RutaUrbana rutaUrbana = new RutaUrbana();
    RutaInterMunicipal rutaInterMunicipal = new RutaInterMunicipal();


    public SistemaTransporte() {
    }

    static Integer validarEdad(Integer edad) {
        Scanner teclado = new Scanner(System.in);
        while (edad <= 0 || edad > 102) {
            System.out.print("Edad invalida. Ingresa de nuevo: ");
            edad = (int) Double.parseDouble(teclado.next().replace(",", "."));
        }
        return edad;
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
        if (usuarios.isEmpty()) {
            System.out.println("no hay ususarios registrados");
        } else {
            for (Usuario us : usuarios) {
                System.out.println("=== Destinos frecuentes de " + us.getNombre() + " ===");
            }
            for (int i = 0; i < destinosFrecuentes.size(); i++) {
                System.out.println(destinosFrecuentes.get(i) + " → Veces: " + frecuenciaDestinos.get(i));
            }
        }

    }


//    public void inicializarRutasInterMunicipales() {
//        rutasInterMunicipales.add(new RutaNovillero());
//        rutasInterMunicipales.add(new RutaPasca());
//        rutasInterMunicipales.add(new RutaChinauta());
//        rutasInterMunicipales.add(new RutaSilvania());
//        rutasInterMunicipales.add(new RutaArbelaez());
//    }

    public void inicializarRutasUrbanas() {
        rutasUrbanas.add(new RutaCentroTerminal());
        rutasUrbanas.add(new RutaGranColombia());
        rutasUrbanas.add(new RutaPampa());
        rutasUrbanas.add(new RutaSanFernando());
        rutasUrbanas.add(new RutaStaMariaLosAngeles());
    }

    public void inicializarRutas() {
        inicializarRutasUrbanas();
        //inicializarRutasInterMunicipales();
    }


    public void mostrarRutaInterMunicipal(int opcionRuta) {
        RutaInterMunicipal ri = new RutaInterMunicipal();
        switch (opcionRuta) {
            case 1:
                ri = new RutaNovillero();
                agregarDestino("RutaNovillero");
                break;
            case 2:
                ri = new RutaPasca();;
                agregarDestino("RutaPasca");
                break;
            case 3:
                ri = new RutaChinauta();
                agregarDestino("RutaGranColombia");
                break;
            case 4:
                ri = new RutaSilvania();
                agregarDestino("RutaSilvania");
                break;
            case 5:
                ri = new RutaArbelaez();
                agregarDestino("RutaArbelaez");
                break;
            default:
                System.out.println("Comuna inválida.");
                return;
        }

        System.out.println("\n=== Ruta recomendada para esta comuna ===");
        ri.mostrarInfoRuta();
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
        Integer opcionz = 0;
        Integer opcion = 0;
        while (opcionz != 2) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("\n=========================================");
            System.out.println("🛠️ PANEL DE ADMINISTRADOR - FUSAROUTE");
            System.out.println("=========================================");
            System.out.println("1️⃣  Ver usuarios registrados");
            System.out.println("2️⃣  Ver promedio de edades");
            System.out.println("3️⃣  Ver estadísticas de rutas");
            System.out.println("4️⃣  Cerrar sesión");
            System.out.print("👉 Opción: ");
            opcion = (int) Double.parseDouble(teclado.next().replace(",", "."));

            switch (opcion) {
                case 1:
                    mostrarUsuario();
                    break;
                case 2:
                    promedioEdad();
                    break;
                case 3:
                    mostrarDestinosConFrecuencia();
                    break;
                case 4:
                    salirOnoSistema();
                    return;
                default:
                    System.out.println("Opción inválida.");

            }
            System.out.println("desea realizar otra opcion? \n 1: si " +
                    "\n 2: no");
            opcionz = (int) Double.parseDouble(teclado.next().replace(",", "."));

        }
        salirOnoSistema();

    }




    public void escogerTipodeRuta() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escogamos el tipo de ruta: ");
        System.out.println("tipos de ruta \n 1: urbana 🏙️ \n 2: intermunicipal 🛣️");
        Integer opcionRuta = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        if (opcionRuta > 2 || opcionRuta <= 0) {
            opcionRuta = validarCase(opcionRuta);
        }
        switch (opcionRuta) {
            case 1:
                rutaUrbana.nombreComunas();
                rutaUrbana.barrioComuna();
//                mostrarRutaPorComuna(opcionRuta);
                break;
            case 2:
                rutaInterMunicipal.nombreRutasIntermunicipales();
                rutaInterMunicipal.mostrarInforRutasIntermunicipal();
                break;
        }
    }

    public void menuInicio() {
        System.out.println("\n=========================================");
        System.out.println("🚌 BIENVENIDO A FUSAROUTE - MENÚ PRINCIPAL");
        System.out.println("=========================================");
        System.out.println("Selecciona una opción:");
        System.out.println("1️⃣  Iniciar sesión");
        System.out.println("2️⃣  Registrar nuevo usuario");
        System.out.println("3️⃣  Salir del sistema");
        System.out.print("👉 Opción: ");

        Integer opcionMenu = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        System.out.println("-----------------------------------------");

        switch (opcionMenu) {
            case 1:
                iniciarSesionUsuario();
                break;
            case 2:
                registrarUsuario();
                menuUsuario();
                break;
            case 3:
                System.out.println("👋 ¡Gracias por usar FusaRoute! Hasta pronto.");
                break;
            default:
                System.out.println("❌ Opción inválida. Intenta de nuevo.");
                menuInicio();
        }
    }


    public void registrarUsuario() {
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("=====Vamos a registrar su usuario=====");
        System.out.print("Ingrese su nombre: ");
        usuario.setNombre(teclado.nextLine());
        System.out.print("Ingrese su documento de identidad: ");
        usuario.setCedula(teclado.next());
        System.out.print("Ingrese su edad: ");
        usuario.setEdad((int) Double.parseDouble(teclado.next().replace(",", ".")));
        Integer edad = usuario.getEdad();
        edad = validarEdad(edad);
        usuario.setEdad(edad);
        System.out.print("Ingrese una contraseña: ");
        usuario.setContraseña(teclado.next());
        System.out.println("Ingresa tu barrio de residencia: ");
        rutaUrbana.nombreComunas();
        rutaUrbana.barrioComunaInicioSesion();
        usuarios.add(usuario);
    }

    public void iniciarSesionUsuario() {
        System.out.println("\n=========================================");
        System.out.println("🔐 INICIO DE SESIÓN - FUSAROUTE 🔐");
        System.out.println("=========================================");

        System.out.print("Ingrese su cédula: ");
        String cedulaIngresada = teclado.next().trim();

        System.out.print("Ingrese su contraseña: ");
        String contraseñaIngresada = teclado.next().trim();

        System.out.println("-----------------------------------------");

        if (administrador.getCedula().equals(cedulaIngresada) &&
                administrador.getContraseña().equals(contraseñaIngresada)) {

            System.out.println("✅ Bienvenido Administrador: " + administrador.getNombre() + " 👨‍💼");
            menuAdmin();
            return;
        }

        boolean usuarioEncontrado = false;
        for (Usuario u : usuarios) {
            if (u.getCedula().equals(cedulaIngresada) && u.getContraseña().equals(contraseñaIngresada)) {

                System.out.println("👋 ¡Bienvenido/a " + u.getNombre() + "! Tu sesión ha sido iniciada correctamente.");
                usuarioEncontrado = true;
                menuUsuario();
                break;
            }
        }

        if (!usuarioEncontrado) {
            System.out.println("❌ Los datos ingresados no son válidos. Verifica tu cédula o contraseña.");
            System.out.println("🔁 Regresando al menú principal...\n");
            salirOnoSistema(); // opción de salir o volver al inicio
        }
    }


    public void salirOnoSistema() {
        Integer opcionSistema = 0;

        System.out.println(" ");
        System.out.println("¿Desea salir del sistema? \n" +
                "1: NO ❌ \n" +
                "2: SI ✅ ");
        opcionSistema = (int) Double.parseDouble(teclado.next().replace(",", "."));
        switch (opcionSistema) {
            case 1:
                menuInicio();
                break;
            case 2:
                System.out.println("===================");
                System.out.println("Gracias por usar FusaRoute 🌈🚎. ¡Vuelve pronto! ");
                break;
        }
    }

    public void mostrarUsuario() {
        Integer cantUsuarios = usuarios.size();
        if (cantUsuarios > 0) {
            System.out.println("Hay un total de " + usuarios.size() + " usuarios reigstrados ");
            System.out.println("Lista de usuarios registrados:");
            for (Usuario us : usuarios) {
                System.out.println(" Nombre: " + us.getNombre() + ", Cédula: " + us.getCedula() + ", Edad: " + us.getEdad());
            }
        } else {
            System.out.println("no hay usuarios registrados");
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
        System.out.println("\n=========================================");
        System.out.println("👤 MENÚ DE USUARIO - FUSAROUTE");
        System.out.println("=========================================");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1️⃣  Iniciar una ruta");
        System.out.println("2️⃣  Cerrar sesión");
        System.out.print("👉 Opción: ");
        Integer opcion = (int) Double.parseDouble(teclado.next().replace(",", "."));
        switch (opcion) {
            case 1:
                escogerTipodeRuta();
                salirOnoSistema();
                break;
            case 2:
                System.out.println("👋 ¡Sesión finalizada! Gracias por usar FusaRoute.");
                salirOnoSistema();
                break;
            default:
                System.out.println("❌ Opción inválida.");
                menuUsuario();
        }
    }

    public void añadirDestinoFavorito() {


    }

    public void mostrarDestinosUsarios() {

    }

    public void barriosMasVisitado() {


    }

    public void promedioEdad() {
        Integer edad = 0;
        Double promedio = (double) usuarios.size();
        if (promedio > 0) {
            for (Usuario us : usuarios) {
                edad += us.getEdad();
            }
            promedio = (double) edad / usuarios.size();
            System.out.println("el promedio de edades de los usuarios es " + promedio);
        } else {
            System.out.println("no hay usuarios registrados");
        }

    }

    public void agregarCalificacion() {

    }

    public void rutaMejorCalificada() {

    }

}
