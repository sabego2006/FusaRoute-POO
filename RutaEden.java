public class RutaEden extends RutaUrbana {
    public RutaEden() {
        super("Eden", "La cabaña", "Santa Anita", "20 minutos", "AV Las palmas, MedSalud", "$2.400");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Rural:" + getNombre());
        System.out.println(" Paraderos:" + getRutaInicio() + "-->" + getRutaFinal());
        System.out.println(" Tiempo Estimado de trayecto: " + getTiempoEstimado());
        System.out.println(" Información: " + getInformacion());
        System.out.println(" Valor:" + getCosto());
    }
}
