public class RutaPampa extends RutaUrbana {

    public RutaPampa() {
        super("La Pampa","Los Girasoles","El Gaitan","*** 20 - 30 min***","Indio, Avenida las Palmas"," $2.400 ");

    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Urbana:"  + getNombre());
        System.out.println(" Paraderos: "           + getRutaInicio() + " --> " + getRutaFinal());
        System.out.println(" Frecuencia estimada: "   + getTiempoEstimado());
        System.out.println(" Información: "         +getInformacion());
        System.out.println(" Costo: "             +getCosto());
    }
}