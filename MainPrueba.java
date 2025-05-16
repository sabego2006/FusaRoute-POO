import java.util.Scanner;

public class MainPrueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        RutaUrbana rutitaUrbanita = new RutaUrbana();
        RutaInterMunicipal rutitaInMunicipal = new RutaInterMunicipal();
        System.out.println("tipos de ruta \n 1: urbana \n 2: intermunicipal");
        Integer opcionRuta= teclado.nextInt();
        if (opcionRuta.equals(1)){
            rutitaUrbanita.nombreComunas();
            rutitaUrbanita.barrioComuna();
        }
        else {
            rutitaInMunicipal.nombreRutasIntermunicipales();
        }
    }
}
