import java.util.ArrayList;

public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String nombre, String cedula, Integer edad,  String contraseña, ArrayList<String> destinosFrecuentes) {
        super(nombre, cedula, edad, contraseña, destinosFrecuentes);
    }

    @Override
    public void mostrarInfo(){
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        sistemaTransporte.mostrarUsuario();
    }


}
