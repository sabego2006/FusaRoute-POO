import java.util.ArrayList;

public class RutaInterMunicipal extends Ruta {
    //Hereda los atributos de su papa
    ArrayList<String>rutasIntermunicipales = new ArrayList<>();
    public void nombreRutasIntermunicipales(){
        rutasIntermunicipales.add("Pasca");
        rutasIntermunicipales.add("Arbelaez");
        rutasIntermunicipales.add("Chinauta");
        rutasIntermunicipales.add("Silvania");
        rutasIntermunicipales.add("Agua Bonita");
        rutasIntermunicipales.add("Tibacuy");
        rutasIntermunicipales.add("Novillero");
        Integer contador=1;
        for (String ruta: rutasIntermunicipales){
            System.out.println(contador+": "+ruta);
            contador+=1;
        }
    }

    public RutaInterMunicipal() {

    }

}
