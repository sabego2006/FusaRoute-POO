package RutasUrbanas;
public class RutaGrancolombia extends RutaUrbana {
    public RutaGrancolombia(){
        super ("gran colombia","Ebenezer", "San Antonio","Tiempo estimado 15 min a 20 min ");

    }
    @Override

    public void mostrarinfoRuta(){
        System.out.println("Ruta Urbana: gran colombia");
        System.out.println("Paraderos: Ebenezer, san Antonio");
        System.out.println("tiempo estimado 15 min a 20 min ");
        System.out.println("esta ruta hace un recorrido por: panamericana el indio, Escuela policia, hospital, Avenida las Plamas, puente del aguila");
        System.out.println("costo: $2.400");
    }

}







