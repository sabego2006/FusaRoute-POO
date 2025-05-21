public class RutaSilvania extends RutaInterMunicipal {
    public RutaSilvania(){
        super("Silvania", "Terminal (AV las palmas, cra 7 con calle 8)", " Silvania (parque principal)", "5:30 AM a 8:00 PM", "Quebrajacho, Cucharal", "$5.000");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println("Ruta Urbana:" + getNombre());
        System.out.println("Paraderos: " + getRutaInicio() + " --> " + getRutaFinal());
        System.out.println("Frecuencia Ruta: " + getTiempoEstimado());
        System.out.println("esta ruta hace un recorrido por: "+getInformacion());
        System.out.println("costo: $2.400 "+getCosto());

    }
}
