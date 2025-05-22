import java.util.ArrayList;

public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String nombre, String cedula, Integer edad, String contraseña) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.contraseña = contraseña;
    }



    @Override
    public void mostrarInfo() {
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        sistemaTransporte.mostrarUsuario();
    }

}

