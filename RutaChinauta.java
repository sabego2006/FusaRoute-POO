public class RutaChinauta extends RutaInterMunicipal{
    public RutaChinauta() {
        super("Chinauta", "Terminal (centro, cra 9 con calle 7)", " Chinauta (escuela)", "5:30 AM", "8:00 PM", "$3.000");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal:" + getNombre());
        System.out.println(" Paraderos:" +getRutaInicio() + "-->" + getRutaFinal());
        System.out.println(" Tiempo Estimado de trayecto: 1 hora " +getTiempoEstimado());
        System.out.println(" Frucuencia estimada:" + getInformacion());
        System.out.println(" Costo: "+getCosto());

    }
}
