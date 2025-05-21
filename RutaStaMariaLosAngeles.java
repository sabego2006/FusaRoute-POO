public class RutaStaMariaLosAngeles  extends RutaUrbana  {
    public RutaStaMariaLosAngeles () {
        super ("Santa Maria de los Angeles ","Treminal","Paradero Santa Maria ", "20-30 Min","Pekin, Ladrilera ","$2.400");
    }
    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal:" + getNombre());
        System.out.println(" Paraderos: "          + getRutaInicio() + "-->" + getRutaFinal());
        System.out.println(" Frecuencia estimada: " + getTiempoEstimado());
        System.out.println(" Información: "        + getInformacion());
        System.out.println(" Costo: "        + getCosto());
    }
}


