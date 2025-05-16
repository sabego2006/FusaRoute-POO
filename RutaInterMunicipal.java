import java.util.ArrayList;

public class RutaInterMunicipal extends Ruta {
    //Hereda los atributos de su papa
    ArrayList<String>rutasIntermunicipales = new ArrayList<>();


    public RutaInterMunicipal() {

    }

    public void nombreRutasIntermunicipales(){
        rutasIntermunicipales.add("Pasca");
        rutasIntermunicipales.add("Arbelaez");
        rutasIntermunicipales.add("Chinauta");
        rutasIntermunicipales.add("Silvania");
        rutasIntermunicipales.add("Agua Bonita");
        rutasIntermunicipales.add("Tibacuy");
        rutasIntermunicipales.add("Novillero");
        for (int i=0; i<rutasIntermunicipales.size(); i++){
            System.out.println((i+1)+": "+rutasIntermunicipales.get(i));
        }
    }



}
