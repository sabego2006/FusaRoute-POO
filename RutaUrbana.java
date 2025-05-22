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


    public void nombreComunas() {
        System.out.println("*** Estan son las comunas urbanas de Fusagasuga ***");
        comunas.add("Centro");
        comunas.add("Norte");
        comunas.add("Occidental");
        comunas.add("Oriental");
        comunas.add("Sur Occidente");
        comunas.add("Sur Oriente");

        for (int i = 0; i < comunas.size(); i++) {
            System.out.println((i + 1) + ": " + comunas.get(i));
        }
        System.out.println("");
        System.out.print("-->");
    }


    public void nombreBarrioComunaCentro() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaCentro.add("Potosi");
        barriosComunaCentro.add("luxemburgo");
        barriosComunaCentro.add("Galeria");
        for (int i = 0; i < barriosComunaCentro.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaCentro.get(i));
        }
        Integer opcionBarrio = (int) Double.parseDouble(teclado.next());
        System.out.println("");
        System.out.print("-->");

    }

    public void nombreBarrioComunaNorte() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaNorte.add("Gaitan");
        barriosComunaNorte.add("La Cabaña");
        barriosComunaNorte.add("El Eden");
        barriosComunaNorte.add("Carlos Lleras");
        barriosComunaNorte.add("Villa Natalia");
        barriosComunaNorte.add("San Antonio");
        for (int i = 0; i < barriosComunaNorte.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaNorte.get(i));
        }
        Integer opcionBarrio = (int) Double.parseDouble(teclado.next());
        System.out.println("");
        System.out.print("-->");
    }

    public void nombreBarrioComunaOccidental() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaOccidental.add("San Mateo");
        barriosComunaOccidental.add("Manila");
        barriosComunaOccidental.add("convoy");
        barriosComunaOccidental.add("Caney");
        barriosComunaOccidental.add("Santa Anita");
        for (int i = 0; i < barriosComunaOccidental.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaOccidental.get(i));
        }
        System.out.println("");
        System.out.print("-->");
    }

    public void nombreBarriosComunaOriental() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaOriental.add("Pekin");
        barriosComunaOriental.add("Coburgo");
        barriosComunaOriental.add("Bonet");
        barriosComunaOriental.add("Sauces");
        for (int i = 0; i < barriosComunaOriental.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaOriental.get(i));
        }
        System.out.println("");
        System.out.print("-->");
    }

    public void nombreBarriosComunaSurOccidente() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaSurOccidental.add("llano largo");
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
        System.out.print("-->");
    }

    public void nombreBarriosComunaSurOriente() {
        System.out.println("****Elija un barrio de esta Comuna: ****");
        barriosComunaSurOriental.add("Balmoral");
        barriosComunaSurOriental.add("Fusacatan");
        barriosComunaSurOriental.add("La Macarena");
        barriosComunaSurOriental.add("El Vergel");
        barriosComunaSurOriental.add("San Fernando");
        barriosComunaSurOriental.add("Camino Real");
        for (int i = 0; i < barriosComunaSurOriental.size(); i++) {
            System.out.println((i + 1) + ": " + barriosComunaSurOriental.get(i));
        }
        Integer opcionBarrio = (int) Double.parseDouble(teclado.next());
        System.out.println("");
        System.out.print("-->");

    }

    public static Integer validarCase(Integer opcionComuna) {
        System.out.print("****Elija un barrio de esta Comuna: ****");
        Scanner teclado = new Scanner(System.in);
        if (opcionComuna >= 6 || opcionComuna <= 0) {
            while (opcionComuna >= 6 || opcionComuna <= 0) {
                System.out.println("numero incorrecot, vuelelo a intentar");
                opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
            }
        }
        return opcionComuna;
    }

    public void mostrarInfoRuta() {

    }

    public void barrioComuna() {
        Scanner teclado = new Scanner(System.in);
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        System.out.println("Escoge unaa opcion: ");
        Integer opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        if (opcionComuna >= 6 || opcionComuna <= 0) {
            opcionComuna = validarCase(opcionComuna);
        }
        switch (opcionComuna) {
            case 1:
                 nombreBarrioComunaCentro();
                RutaCentroTerminal rutaCentroTerminal = new RutaCentroTerminal();
                rutaCentroTerminal.mostrarInfoRuta();

                break;
            case 2:
                nombreBarrioComunaNorte();
                RutaGranColombia rutaGranColombia = new RutaGranColombia();
                rutaGranColombia.mostrarInfoRuta();

                nombreBarrioComunaNorte();
                RutaSanFernando rutaSanFernando = new RutaSanFernando();
                rutaSanFernando.mostrarInfoRuta();


                break;
            case 3:
                nombreBarrioComunaOccidental();
                RutaEden rutaEden = new RutaEden();
                rutaEden.mostrarInfoRuta();

                break;
            case 4:
                nombreBarriosComunaOriental();
                RutaSanFernando rutaSanFernando1 = new RutaSanFernando();
                rutaSanFernando1.mostrarInfoRuta();

                break;
            case 5:
                nombreBarriosComunaSurOccidente();
                RutaPampa rutaPampa = new RutaPampa();
                rutaPampa.mostrarInfoRuta();

                break;
            case 6:
                nombreBarriosComunaSurOriente();

                break;
            default:
                System.out.println("opcion invalido, vuelvelo a intentarlo");
        }

        }


    }
