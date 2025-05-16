import java.util.Scanner;

public class MainPrueba {


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


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        RutaUrbana rutitaUrbanita = new RutaUrbana();
        RutaInterMunicipal rutitaInMunicipal = new RutaInterMunicipal();
        System.out.println("tipos de ruta \n 1: urbana \n 2: intermunicipal");
        Integer opcionRuta= teclado.nextInt();
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
                break;
        }
    }
}
