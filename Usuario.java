import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    //Atributos
    String nombre;
    String cedula;
    Integer edad;
    String contraseña;
    String barrioDeResidencia;

    String destinosFrecuentes;



    public void agregarDestinoFrecuente(String destino) {
        if (destinosFrecuentes == null) {
//            destinosFrecuentes = new ArrayList<>();
        }
//        destinosFrecuentes.add(destino);
    }


    //Constructores
    public Usuario() {
    }


    public Usuario(String nombre, String cedula, Integer edad, String contraseña, String destinosFrecuentes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.destinosFrecuentes = destinosFrecuentes;
        this.contraseña=contraseña;
    }

    public void seleccionarDestino(String[] destinos, Integer indice){
    if (indice >= 0 && indice < destinos.length) {
        String destino = destinos[indice];
        if (!destinosFrecuentes.contains(destino)) {
        }
    }

    }
    public void mostrarInfo(){
        System.out.println("***** INFORMACIÓN USUARIO *****");
        System.out.println("Nombre: " + Usuario.this.nombre);
        System.out.println("Cedula: " + Usuario.this.cedula);
        System.out.println("Edad: " + Usuario.this.edad);
        System.out.println("Destinos frecuentes: " + Usuario.this.destinosFrecuentes);
    }

    //Setter & Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

//    public ArrayList<String> getDestinosFrecuentes() {
//        return destinosFrecuentes;
//    }

//    public void setDestinosFrecuentes(ArrayList<String> destinosFrecuentes) {
//        this.destinosFrecuentes = destinosFrecuentes;
//    }
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getBarrioDeResidencia() {
        return barrioDeResidencia;
    }

    public void setBarrioDeResidencia(String barrioDeResidencia) {
        this.barrioDeResidencia = barrioDeResidencia;
    }

}
