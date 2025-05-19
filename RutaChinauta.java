public class RutaChinauta extends RutaInterMunicipal{
    public RutaChinauta() {
        super("Chinauta", "Terminal (centro, cra 9 con calle 7)", " Chinauta (escuela)", "5:30 AM", "8:00 PM", "Frecuencia: 20 minutos");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal: CHINAUTA ");
        System.out.println(" Paraderos: Terminal (centro, cra 9 con calle 7) --> Chinauta (Escuela) ");
        System.out.println(" Tiempo Estimado de trayecto: 1 hora ");
        System.out.println(" Frucuencia estimada: 20 minutos");
        System.out.println(" Costo: $10.000");

    }
}
