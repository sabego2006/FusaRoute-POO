import java.util.ArrayList;
import java.util.Scanner;

public class RutaInterMunicipal extends Ruta{
    ArrayList<String> rutasIntermunicipales = new ArrayList<>();
    public  RutaInterMunicipal(){
    }

    public RutaInterMunicipal(String nombre, String rutaInicio, String rutaFinal, String tiempoEstimado, String informacion, String costo) {
        super(nombre, rutaInicio, rutaFinal, tiempoEstimado, informacion, costo);
    }


    public void mostrarInfoRuta() {
    }


    public void nombreRutasIntermunicipales(){
        rutasIntermunicipales.add("Novillero");
        rutasIntermunicipales.add("Pasca");
        rutasIntermunicipales.add("Chinauta");
        rutasIntermunicipales.add("Silvania");
        rutasIntermunicipales.add("Arbelaez");
        for (int i = 0; i < rutasIntermunicipales.size(); i++) {
            System.out.println((i + 1) + ": " + rutasIntermunicipales.get(i));
        }
    }

    public static Integer validarCase(Integer opcionComuna) {
        Scanner teclado = new Scanner(System.in);
        if (opcionComuna >= 6 || opcionComuna <= 0) {
            while (opcionComuna >= 6 || opcionComuna <= 0) {
                System.out.println("numero incorrecot, vuelelo a intentar");
                opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
            }
        }
        return opcionComuna;
    }

    public void mostrarInforRutasIntermunicipal() {
        Scanner teclado = new Scanner(System.in);
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        System.out.println("Escoge una opcion: ");
        Integer opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        if (opcionComuna > 6 || opcionComuna <= 0) {
            opcionComuna = validarCase(opcionComuna);
        }
        switch (opcionComuna) {
            case 1:
                sistemaTransporte.mostrarRutaInterMunicipal(opcionComuna);
                break;
            case 2:
                sistemaTransporte.mostrarRutaInterMunicipal(opcionComuna);
                break;
            case 3:
                sistemaTransporte.mostrarRutaInterMunicipal(opcionComuna);
                break;
            case 4:
                sistemaTransporte.mostrarRutaInterMunicipal(opcionComuna);
                break;
            case 5:
                sistemaTransporte.mostrarRutaInterMunicipal(opcionComuna);
                break;
            default:
                System.out.println("Opción invalida ❌. Intenta de nuevo.");
                mostrarInforRutasIntermunicipal();
        }

    }

    }

