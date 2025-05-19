public class RutaSilvania extends RutaInterMunicipal {
    public RutaSilvania(){
        super("Silvania", "Terminal (AV las palmas, cra 7 con calle 8)", " Silvania (parque principal)", "5:30 AM", "8:00 PM", "Frecuencia: 1 hora");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal: SILVANIA ");
        System.out.println(" Paraderos: Terminal (AV las palmas, cra 7 con calle 8) --> Silvania (Parque principal) ");
        System.out.println(" Tiempo Estimado de trayecto: 1 hora ");
        System.out.println(" Frucuencia estimada: 1 hora");
        System.out.println(" Costo: $3.800");

    }
}
