import java.util.ArrayList;

public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String nombre, String cedula, Integer edad, String barrioResidencia, ArrayList<String> destinosFrecuentes) {
        super(nombre, cedula, edad, barrioResidencia, destinosFrecuentes);
    }
    public void mostrarInfo(){

    }

}
