public class RutaArbelaez extends RutaInterMunicipal {
    public RutaArbelaez() {
        super("Arbelaez", "Terminal (cra 8, palacio de las tortas)", "Arbelaez (cafeteria las brisas)", "5:30 AM", "8:00 PM", "Frecuencia: 1 hora");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal: ARBELAEZ ");
        System.out.println(" Paraderos: Terminal (cra 8, frente al palacio de las tortas) --> Arbelaez (CL. 6 #6-2a 5-56) ");
        System.out.println(" Tiempo Estimado de trayecto: 40 minutos ");
        System.out.println(" Frucuencia estimada: 1 hora");
        System.out.println(" Costo: $3.900 ");

    }
}
