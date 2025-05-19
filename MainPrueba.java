import java.util.Scanner;

public class MainPrueba {
Scanner teclado = new Scanner(System.in);

    static Integer validarCase(Integer opcionRuta) {
        Scanner teclado = new Scanner(System.in);
        if (opcionRuta > 2 || opcionRuta <= 0) {
            while (opcionRuta > 2 || opcionRuta <= 0) {
                System.out.println("numero incorrecot, vuelvelo a intentar");
                opcionRuta = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
            }
        }
        return opcionRuta;
    }


    public static void elegirRUtaUsuario() {
        Administrador administrador= new Administrador();
        RutaUrbana rutitaUrbanita = new RutaUrbana();
        RutaInterMunicipal rutitaInMunicipal = new RutaInterMunicipal();
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        Integer opcionSistema=0;
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
                sistemaTransporte.iniciarSesionUsario();
                break;
            case 2:
                sistemaTransporte.registrarUsuario();
                break;
            case 3:
                break;
        }
    }

    public static void main(String[] args) {
        Administrador administrador= new Administrador();
        RutaUrbana rutitaUrbanita = new RutaUrbana();
        RutaInterMunicipal rutitaInMunicipal = new RutaInterMunicipal();
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        Integer opcionSistema=0;
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
                sistemaTransporte.iniciarSesionUsario();
                break;
            case 2:
                 sistemaTransporte.registrarUsuario();
                 sistemaTransporte.escogerTipodeRuta();
                 sistemaTransporte.salirOnoSistema();
                break;
            case 3:
                break;
        }
     sistemaTransporte.mostrarUsuario();

    }
}
