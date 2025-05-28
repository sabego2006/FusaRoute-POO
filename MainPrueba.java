import java.util.Scanner;

public class MainPrueba {
    Scanner teclado = new Scanner(System.in);

    static int validarCase(int opcionMenu) {
        Scanner teclado = new Scanner(System.in);
            while (opcionMenu > 3 || opcionMenu <= 0) {
                System.out.print("¡numero incorrecto! Por favor vuelve a intentarlo: ");
                opcionMenu = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));

        }
        return opcionMenu;
    }




    public static void main(String[] args) {
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        Integer opcionSistema = 0;
        Scanner teclado = new Scanner(System.in);



        System.out.println("¡BIENVENIDO A FUSAROUTE! \n A continuación lo llevaremos a nuestro menú ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1️⃣  Iniciar sesión");
        System.out.println("2️⃣  Registrar nuevo usuario");
        System.out.println("3️⃣  Salir del sistema");
        System.out.print("👉 Opción: ");
        int opcionMenu= (int) Double.parseDouble(teclado.next().trim().replace(",","."));
        System.out.println("----------------------------------------------------------------------");
        opcionMenu=validarCase(opcionMenu);
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
                System.out.println("===================");
                System.out.println("Gracias por usar FusaRoute 🌈🚎. ¡Vuelve pronto! ");
                break;
            default:
                System.out.println("numero invalido, vueva a intentarlo");
        }
    }
}
