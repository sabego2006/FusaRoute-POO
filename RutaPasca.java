public class RutaPasca extends RutaInterMunicipal {
    public RutaPasca() {
        super("Pasca","Terminal (Potosi)", "Pasca (Parque principal)", "5:30 AM - 8:00 PM", "Alaska, Mirador el Molino ", "$3.900");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal:" + getNombre());
        System.out.println(" Paraderos: "          +getRutaInicio()+ "-->" + getRutaFinal());
        System.out.println(" Frecuencia estimada: " +getTiempoEstimado());
        System.out.println(" Información: "         + getInformacion());
        System.out.println(" Costo: "  +getCosto());

    }
}
