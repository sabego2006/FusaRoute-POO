package RutasInterMunicipales;

public class RutaPasca extends RutaInterMunicipal {
    public RutaPasca() {
        super("Pasca","Terminal (Potosi)", "Pasca (Parque principal)", "5:30 AM", "8:00 PM", "Frecuencia: 30 minutos");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal: PASCA ");
        System.out.println(" Paraderos: Terminal (Potosi) --> Parque principal de Pasca");
        System.out.println(" Tiempo estimado de trayecto: 30 minutos ");
        System.out.println(" Frecuencia estimada: 30 minutos");
        System.out.println(" Costo: $3.900 ");

    }
}
