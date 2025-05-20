public class RutaPampa extends RutaUrbana {
    public RutaPampa(){
        super ("La Pampa","Los Girasoles ","El Gaitan","Tiempo estimado 20 min a 30 min");

    }
    @Override

    public void mostrarinfoRuta(){
        System.out.println("Ruta Urbana: La Pampa");
        System.out.println("Paraderos: Pampa Los Girasoles, El gaitan");
        System.out.println("tiempo estimado 20 min a 30 min ");
        System.out.println("esta ruta hace un recorrido por: panamericana el indio, hospital, Avenida las Palmas, puente del aguila");
        System.out.println("costo: $2.400");
