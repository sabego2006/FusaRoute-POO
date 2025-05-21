import java.util.ArrayList;
import java.util.Scanner;

public class RutaInterMunicipal extends Ruta{
    //Hereda los atributos de su papa





    public  RutaInterMunicipal(){

    }

    public RutaInterMunicipal(String nombre, String rutaInicio, String rutaFinal, String tiempoEstimado, String informacion, String costo) {
        super(nombre, rutaInicio, rutaFinal, tiempoEstimado, informacion, costo);
    }

    public void mostrarInfoRuta() {

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
        System.out.println("Escoge una opcion: ");
        Integer opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        if (opcionComuna >= 6 || opcionComuna <= 0) {
            opcionComuna = validarCase(opcionComuna);
        }
        switch (opcionComuna) {
            case 1:
                RutaPasca rutaPasca = new RutaPasca();
                rutaPasca.mostrarInfoRuta();
                break;
            case 2:
                RutaArbelaez rutaArbelaez = new RutaArbelaez();
                rutaArbelaez.mostrarInfoRuta();
                break;
            case 3:
                RutaChinauta rutaChinauta = new RutaChinauta();
                rutaChinauta.mostrarInfoRuta();
                break;
            case 4:
                RutaSilvania rutaSilvania = new RutaSilvania();
                rutaSilvania.mostrarInfoRuta();
                break;
            case 6:
                RutaNovillero rutaNovillero = new RutaNovillero();
                rutaNovillero.mostrarInfoRuta();
                break;
            default:
                System.out.println("opcion invalido, vuelvelo a intentarlo");
        }

    }

    }

