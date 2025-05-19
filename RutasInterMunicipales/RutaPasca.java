package RutasInterMunicipales;

public class RutaPasca extends RutaInterMunicipal {
    public RutaPasca() {
        super("Pasca", new String[]{"Terminal (Potosi)", "Pasca (Parque principal)"}, "5:30 AM", "8:00 PM");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal: PASCA ");
        System.out.println(" Paraderos: Terminal (Potosi) --> Parque principal de Pasca");
        System.out.println(" Tiempo Estimado: 30 minutos ");
        System.out.println(" Costo: $3.900 ");

    }
}
