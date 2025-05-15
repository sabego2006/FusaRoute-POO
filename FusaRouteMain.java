import java.util.Scanner;

public class FusaRouteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaTransporte sistema = new SistemaTransporte();
        sistema.inicializarRutasPredeterminadas();

        Integer opcion;

        do {
            System.out.println("\n====== SISTEMA DE RUTAS DE BUSETA - FUSAGASUGÁ ======");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Ver usuarios registrados");
            System.out.println("3. Mostrar rutas disponibles");
            System.out.println("4. Seleccionar destino frecuente");
            System.out.println("5. Ver destinos frecuentes por usuario");
            System.out.println("6. Buscar rutas que pasan por un barrio");
            System.out.println("7. Calificar una ruta");
            System.out.println("8. Ver ruta mejor calificada");
            System.out.println("9. Ver barrio más visitado");
            System.out.println("10. Ver promedio de edad de usuarios");
            System.out.println("0. Salir");
            System.out.println("=====================================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

//            switch (opcion) {
//                case 1:
//                    sistema.registrarUsuario(scanner);
//                    break;
//                case 2:
//                    sistema.mostrarUsuarios();
//                    break;
//                case 3:
//                    sistema.mostrarRutas();
//                    break;
//                case 4:
//                    sistema.menuSeleccionarDestino(scanner);
//                    break;
//                case 5:
//                    sistema.mostrarDestinosPorUsuario();
//                    break;
//                case 6:
//                    sistema.buscarRutasPorBarrio(scanner);
//                    break;
//                case 7:
//                    sistema.calificarRuta(scanner);
//                    break;
//                case 8:
//                    sistema.mostrarRutaMejorCalificada();
//                    break;
//                case 9:
//                    sistema.mostrarBarrioMasVisitado();
//                    break;
//                case 10:
//                    sistema.mostrarPromedioEdad();
//                    break;
//                case 0:
//                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
//                    break;
//                default:
//                    System.out.println("Opción inválida. Intente de nuevo.");
//            }

        } while (opcion != 0);


//    }

    }
}
