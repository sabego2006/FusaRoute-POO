public class RutaNovillero extends RutaInterMunicipal {
    public RutaNovillero (){
        super("Novillero", "Terminal (cra 10 con calle 7)", " club campestre el bosque (El Ato)", "6:00 AM","Terminal, Glorieta Lucho Herrera", "$2.800");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal:" + getNombre());
        System.out.println(" Paraderos:" + getRutaInicio() + "-->" + getRutaFinal());
        System.out.println(" Tiempo Estimado de trayecto: 1 hora "+getInformacion());
        System.out.println(" Frucuencia estimada:" + getInformacion());
        System.out.println(" Costo: $3.600"+getCosto());

    }
}

