import java.util.Scanner;

public class MainPrueba {
Scanner teclado = new Scanner(System.in);

    static Integer validarCase(Integer opcionRuta) {
        Scanner teclado = new Scanner(System.in);
        if (opcionRuta > 2 || opcionRuta <= 0) {
            while (opcionRuta > 2 || opcionRuta <= 0) {
                System.out.println("¡¡NÚMERO INCORRECTO!! Por favor vuelve a intentarlo");
                opcionRuta = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
            }
        }
        return opcionRuta;
    }




    public static void main(String[] args) {
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        Integer opcionSistema = 0;
        Scanner teclado = new Scanner(System.in);



        System.out.println("¡BIENVENIDO A FUSAROUTE! \n A continuación lo llevaremos a nuestro menú ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Por favor escoja una opcion :");
        System.out.println("1: iniciar sesion \n" +
                "2: registrar usuario \n"+
                "3: Salir");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("-->");
        Integer opcionMenu= (int) Double.parseDouble(teclado.next().trim().replace(",","."));

        switch (opcionMenu){
            case 1:
                sistemaTransporte.iniciarSesionUsuario();

                break;
            case 2:
                 sistemaTransporte.registrarUsuario();
                 sistemaTransporte.menuUsuario();
                 sistemaTransporte.salirOnoSistema();
                break;
            case 3:
                break;
        }
    }
}
