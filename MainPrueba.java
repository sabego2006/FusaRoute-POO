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


    public void elegirRUtaUsuario(){
        Scanner teclado = new Scanner(System.in);
        RutaUrbana rutitaUrbanita = new RutaUrbana();
        RutaInterMunicipal rutitaInMunicipal = new RutaInterMunicipal();

        SistemaTransporte sistemaTransporte = new SistemaTransporte();

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
                break;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        RutaUrbana rutitaUrbanita = new RutaUrbana();
        RutaInterMunicipal rutitaInMunicipal = new RutaInterMunicipal();

        SistemaTransporte sistemaTransporte = new SistemaTransporte();

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
                break;
        }
    }
}
