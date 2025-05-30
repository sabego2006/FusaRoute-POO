public class RutaSanFernando extends RutaUrbana {
    public RutaSanFernando() {
        super("San Fernando.", "San Fernando.", "San Antonio.", "20-30 Min." ,"Avenida Las Plamas, CC San Fernando."," $2.400 ");

    }
    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Urbana:" + getNombre());
        System.out.println(" Paraderos: "          + getRutaInicio() + "-->" + getRutaFinal());
        System.out.println(" Frecuencia estimada: " + getTiempoEstimado());
        System.out.println(" Información: "        + getInformacion());
        System.out.println(" Costo: "        + getCosto());
    }
}
