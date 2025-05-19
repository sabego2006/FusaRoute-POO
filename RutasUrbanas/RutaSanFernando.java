package RutasUrbanas;
public class RutaSanFernando extends RutaUrbana {
    public RutaSanFernando(){
        super ("San fernando","San Fernando ","San Antonio ","Tiempo estimado 20 min a 30 min");

    }
    @Override

    public void mostrarinfoRuta(){
        System.out.println("Ruta Urbana: San Fernando");
        System.out.println("Paraderos: San Fernando, San Antonio");
        System.out.println("tiempo estimado 20 min a 30 min ");
        System.out.println("esta ruta hace un recorrido por: Santa Barbara, Avenida las Palmas, hospital, puente del aguila");
        System.out.println("costo: $2.400");

