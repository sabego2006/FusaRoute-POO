public class RutaNovillero extends RutaInterMunicipal {
    public RutaNovillero (){
        super("Novillero", "Terminal (cra 10 con calle 7)", " club campestre el bosque (El Ato)", "6:00 AM", "6:00 PM", "Frecuencia: 1 hora");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal: Novillero ");
        System.out.println(" Paraderos: Terminal (cra 10 con calle 7) --> Club campestre el bosque (el Ato) ");
        System.out.println(" Tiempo Estimado de trayecto: 1 hora ");
        System.out.println(" Frucuencia estimada: 1 hora");
        System.out.println(" Costo: $3.600");

    }
}

