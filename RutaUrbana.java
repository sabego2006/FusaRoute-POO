import java.util.ArrayList;
import java.util.Scanner;

public class RutaUrbana extends Ruta {


    protected ArrayList<String> comunas = new ArrayList<>();
    protected ArrayList<String> barriosComunaCentro = new ArrayList<>();
    protected ArrayList<String> barriosComunaNorte = new ArrayList<>();
    protected ArrayList<String> barriosComunaOccidental = new ArrayList<>();
    ArrayList<String> barriosComunaOriental = new ArrayList<>();
    ArrayList<String> barriosComunaSurOriental = new ArrayList<>();
    ArrayList<String> barriosComunaSurOccidental = new ArrayList<>();


    public RutaUrbana() {

    }

    public RutaUrbana(String nombre, String rutaInicio, String rutaFinal, String tiempoEstimado, String informacion, String costo) {
        super(nombre, rutaInicio, rutaFinal, tiempoEstimado, informacion, costo);
    }
    public static Integer validarCase(Integer opcionComuna) {
        Scanner teclado = new Scanner(System.in);
        if (opcionComuna > 6 || opcionComuna <= 0) {
            while (opcionComuna > 6 || opcionComuna <= 0) {
                System.out.println("numero incorrecot, vuelelo a intentar");
                opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
            }
        }
        return opcionComuna;
    }

    public void nombreComunas() {
        System.out.println("*** Estan son las comunas urbanas de Fusagasuga ***");
        comunas.clear();
        comunas.add("Centro: Potosí - Olaya ");
        comunas.add("Norte: Villa Natalia - Gaitan.");
        comunas.add("Occidental: San Mateo - Santa Anita.");
        comunas.add("Oriental: Pekín - Sauces.");
        comunas.add("Sur Occidente: Cooviprof - San Francisco.");
        comunas.add("Sur Oriente: Balmoral - Camino Real.");

        for (int i = 0; i < comunas.size(); i++) {
            System.out.println((i + 1) + ": " + comunas.get(i));
        }
        System.out.println("-->");
    }


    public void nombreBarrioComunaCentro() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaCentro.clear();
        barriosComunaCentro.add("Potosí.");
        barriosComunaCentro.add("Luxemburgo.");
        barriosComunaCentro.add("Galeria.");
        barriosComunaCentro.add("Olaya.");
        for (int i = 0; i < barriosComunaCentro.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaCentro.get(i));
        }
        Integer opcionBarrio = -1;
        while (opcionBarrio < 1 || opcionBarrio > barriosComunaCentro.size()) {
            System.out.print("--> ");
            opcionBarrio = (int) Double.parseDouble(teclado.next().replace(",", "."));
            if (opcionBarrio < 1 || opcionBarrio > barriosComunaCentro.size()) {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }

    }

    public void nombreBarrioComunaNorte() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaNorte.clear();
        barriosComunaNorte.add("Gaitan.");
        barriosComunaNorte.add("La Cabaña.");
        barriosComunaNorte.add("El Eden.");
        barriosComunaNorte.add("Carlos Lleras.");
        barriosComunaNorte.add("Villa Natalia.");
        barriosComunaNorte.add("San Antonio.");
        for (int i = 0; i < barriosComunaNorte.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaNorte.get(i));
        }
        System.out.println("");
        Integer opcionBarrio = -1;
        while (opcionBarrio < 1 || opcionBarrio > barriosComunaNorte.size()) {
            System.out.print("--> ");
            opcionBarrio = (int) Double.parseDouble(teclado.next().replace(",", "."));
            if (opcionBarrio < 1 || opcionBarrio > barriosComunaNorte.size()) {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }
    }

    public void nombreBarrioComunaOccidental() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaOccidental.clear();
        barriosComunaOccidental.add("San Mateo.");
        barriosComunaOccidental.add("Manila.");
        barriosComunaOccidental.add("Convoy.");
        barriosComunaOccidental.add("Caney.");
        barriosComunaOccidental.add("Santa Anita.");
        for (int i = 0; i < barriosComunaOccidental.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaOccidental.get(i));
        }
        System.out.println("");
        Integer opcionBarrio = -1;
        while (opcionBarrio < 1 || opcionBarrio > barriosComunaOccidental.size()) {
            System.out.print("--> ");
            opcionBarrio = (int) Double.parseDouble(teclado.next().replace(",", "."));
            if (opcionBarrio < 1 || opcionBarrio > barriosComunaOccidental.size()) {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }
    }

    public void nombreBarriosComunaOriental() {
            System.out.println("****Elija un barrio de esta Comuna: ****");
            barriosComunaOriental.clear();
            barriosComunaOriental.add("Pekin.");
            barriosComunaOriental.add("Coburgo.");
            barriosComunaOriental.add("Bonet.");
            barriosComunaOriental.add("Sauces.");
            for (int i = 0; i < barriosComunaOriental.size(); i++) {
                System.out.println((i + 1) + ": " + barriosComunaOriental.get(i));
            }
            System.out.println("");
        Integer opcionBarrio = -1;
        while (opcionBarrio < 1 || opcionBarrio > barriosComunaOriental.size()) {
            System.out.print("--> ");
            opcionBarrio = (int) Double.parseDouble(teclado.next().replace(",", "."));
            if (opcionBarrio < 1 || opcionBarrio > barriosComunaOriental.size()) {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }

    }

    public void nombreBarriosComunaSurOccidente() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaSurOccidental.clear();
        barriosComunaSurOccidental.add("Llano largo");
        barriosComunaSurOccidental.add("La Pampa");
        barriosComunaSurOccidental.add("Coviproof");
        barriosComunaSurOccidental.add("Maiz Amarillo");
        barriosComunaSurOccidental.add("Ebenezer");
        barriosComunaSurOccidental.add("Llano Verde");
        barriosComunaSurOccidental.add("Gran Colombia");
        barriosComunaSurOccidental.add("San francisco");
        for (int i = 0; i < barriosComunaSurOccidental.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaSurOccidental.get(i));
        }
        System.out.println("");
        Integer opcionBarrio = -1;
        while (opcionBarrio < 1 || opcionBarrio > barriosComunaSurOccidental.size()) {
            System.out.print("--> ");
            opcionBarrio = (int) Double.parseDouble(teclado.next().replace(",", "."));
            if (opcionBarrio < 1 || opcionBarrio > barriosComunaSurOccidental.size()) {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }
    }
    public void nombreBarriosComunaSurOriente() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaSurOriental.clear();
        barriosComunaSurOriental.add("Balmoral");
        barriosComunaSurOriental.add("Fusacatan");
        barriosComunaSurOriental.add("La Macarena");
        barriosComunaSurOriental.add("El Vergel");
        barriosComunaSurOriental.add("San Fernando");
        barriosComunaSurOriental.add("Camino Real");
        for (int i = 0; i < barriosComunaSurOriental.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaSurOriental.get(i));
        }
        Integer opcionBarrio = -1;
        while (opcionBarrio < 1 || opcionBarrio > barriosComunaSurOriental.size()) {
            System.out.print("--> ");
            opcionBarrio = (int) Double.parseDouble(teclado.next().replace(",", "."));
            if (opcionBarrio < 1 || opcionBarrio > barriosComunaSurOriental.size()) {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }

    }



    public void mostrarInfoRuta() {

    }

    public void barrioComunaInicioSesion() {
        Scanner teclado = new Scanner(System.in);
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        System.out.print("Escoge una opcion: ");
        Integer opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        if (opcionComuna > 6 || opcionComuna <= 0) {
            opcionComuna = validarCase(opcionComuna);
        }
        switch (opcionComuna) {
            case 1:
                 nombreBarrioComunaCentro();

                break;
            case 2:
                nombreBarrioComunaNorte();
                break;
            case 3:
                nombreBarrioComunaOccidental();

                break;
            case 4:
                nombreBarriosComunaOriental();

                break;
            case 5:
                nombreBarriosComunaSurOccidente();

                break;
            case 6:
                nombreBarriosComunaSurOriente();
                break;
            default:
                System.out.println("Opción invalida ❌. Intenta de nuevo.");
                barrioComunaInicioSesion();
        }

        }
    public void barrioComuna() {
        Scanner teclado = new Scanner(System.in);
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        System.out.print("Escoge una opcion: ");
        Integer opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        if (opcionComuna > 6 || opcionComuna <= 0) {
            opcionComuna = validarCase(opcionComuna);
        }
        switch (opcionComuna) {
            case 1:
                nombreBarrioComunaCentro();
                sistemaTransporte.mostrarRutaPorComuna(opcionComuna);

                break;
            case 2:
                nombreBarrioComunaNorte();
                sistemaTransporte.mostrarRutaPorComuna(opcionComuna);
                break;
            case 3:
                nombreBarrioComunaOccidental();
                sistemaTransporte.mostrarRutaPorComuna(opcionComuna);
                break;
            case 4:
                nombreBarriosComunaOriental();
                sistemaTransporte.mostrarRutaPorComuna(opcionComuna);
                break;
            case 5:
                nombreBarriosComunaSurOccidente();
                sistemaTransporte.mostrarRutaPorComuna(opcionComuna);
                break;
            case 6:
                nombreBarriosComunaSurOriente();
                sistemaTransporte.mostrarRutaPorComuna(opcionComuna);
                break;
            default:
                System.out.println("Opción invalida ❌. Intenta de nuevo.");
        }

    }


    }
