public class RutaCentroTerminal extends RutaUrbana {
    public RutaCentroTerminal () {
        super ("Centro Terminal","El mirador La pampa","Terminal","20 - 30 Min","Panamericana Indío, Avenida las Palmas", "$2.400");

    }
    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Urbana :" + getNombre());
        System.out.println(" Paraderos: "          + getRutaInicio() + "-->" + getRutaFinal());
        System.out.println(" Frecuencia estimada: " + getTiempoEstimado());
        System.out.println(" Información: "        + getInformacion());
        System.out.println(" Costo: "        + getCosto());
    }
}


