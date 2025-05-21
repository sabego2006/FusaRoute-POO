public class RutaArbelaez extends RutaInterMunicipal {
    public RutaArbelaez() {
        super("Arbelaez", "Terminal (cra 8, palacio de las tortas)", "Arbelaez (CL. 6 #6-2a 5-56)", "1 hora","Recorre la ", " $6.000");
    }

    @Override
    public void mostrarInfoRuta() {
        System.out.println(" Ruta Intermunicipal:"          + getNombre());
        System.out.println(" Paraderos: "                    + getRutaInicio() + " --> " +getRutaFinal());
        System.out.println(" Frecuencia estimada: "        + getTiempoEstimado());
        System.out.println(" Información: "                  );
        System.out.println(" Costo: $3.900 "            );

    }
}
