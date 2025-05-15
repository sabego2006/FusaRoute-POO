import java.util.ArrayList;

public class RutaInterMunicipal extends Ruta {
    //Hereda los atributos de su papa
    String[] rutasIntermunicipales = {
            "Pasca", "Arbelaez", "Chinauta", "Silvania", "Agua Bonita", "Tibacuy", "Novillero"};

    public RutaInterMunicipal() {
        this.rutasIntermunicipales = rutasIntermunicipales;

    }

    public String[] getRutasIntermunicipales() {
        return rutasIntermunicipales;
    }

    public void setRutasIntermunicipales(String[] rutasIntermunicipales) {
        this.rutasIntermunicipales = rutasIntermunicipales;
    }
}
