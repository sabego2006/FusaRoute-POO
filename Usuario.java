import java.util.ArrayList;

public class Usuario {

    //Atributos
    private String nombre;
    private String cedula;
    private Integer edad;
    private String barrioResidencia;
    private String contraseña;
    ArrayList<String> destinosFrecuentes;
//peo
    //Constructores
    public Usuario() {
    }


    public Usuario(String nombre, String cedula, Integer edad, String barrioResidencia,String contraseña, ArrayList<String> destinosFrecuentes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.barrioResidencia = barrioResidencia;
        this.destinosFrecuentes = destinosFrecuentes;
        this.contraseña=contraseña;
    }
    //Metodos
//    public void seleccionarDestino(String[] destinos, Integer indice){
//    if (indice >= 0 && indice < destinos.length) {
//        String destino = destinos[indice];
//        if (!destinosFrecuentes.contains(destino)) {
//        }
//    }
//
//    }
    public void mostrarInfo(){
        System.out.println("***** INFORMACIÓN USUARIO *****");
        System.out.println("Nombre: " + Usuario.this.nombre);
        System.out.println("Cedula: " + Usuario.this.cedula);
        System.out.println("Edad: " + Usuario.this.edad);
        System.out.println("Barrio de residencia: " + Usuario.this.barrioResidencia);
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrioResidencia() {
        return barrioResidencia;
    }

    public void setBarrioResidencia(String barrioResidencia) {
        this.barrioResidencia = barrioResidencia;
    }

    public ArrayList<String> getDestinosFrecuentes() {
        return destinosFrecuentes;
    }

    public void setDestinosFrecuentes(ArrayList<String> destinosFrecuentes) {
        this.destinosFrecuentes = destinosFrecuentes;
    }
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }



}
