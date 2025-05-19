import java.util.ArrayList;
import java.util.Scanner;

public class RutaInterMunicipal extends Ruta {
    //Hereda los atributos de su papa

    ArrayList<String>inforRutas = new ArrayList<>();

    protected String destino;
    protected String inicioruta;
    protected String finruta;
    protected String horainicio;
    protected String horafin;
    protected String FrecuenciaBus;

    public RutaInterMunicipal(inforRutas, String destino, String inicioruta, String finruta, String horainicio, String horafin, String frecuenciaBus) {
        this.inforRutas = inforRutas;
        this.destino = destino;
        this.inicioruta = inicioruta;
        this.finruta = finruta;
        this.horainicio = horainicio;
        this.horafin = horafin;
        FrecuenciaBus = frecuenciaBus;
    }
    public void mostrarInfoRuta(){

    }

    public void infoRutaPasca () {
        System.out.println("el paradero queda en la galeria");

    }

    public void infoRutaArbalaez(){
        System.out.println("el paradero queda en frente del palacio de las tortas");
    }
    public void infoRutaChinauta(){
        System.out.println();
    }
    public void infoRutaSilvania(){
        System.out.println();
    }
    public void infoRutaAguaBonita(){
        System.out.println();
    }
    public void infoRutaTibacuy(){
        System.out.println();
    }
    public void infoRutaNovillero(){
        System.out.println();
    }

    public void nombreRutasIntermunicipales(){
        rutasIntermunicipales.add(RutaPasca);
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
    public static Integer validarCase(Integer opcionComuna){
        Scanner teclado = new Scanner(System.in);
        if (opcionComuna>=6 || opcionComuna<=0){
            while (opcionComuna>=6 || opcionComuna<=0){
                System.out.println("numero incorrecot, vuelelo a intentar");
                opcionComuna=(int)Double.parseDouble(teclado.next().trim().replace(",","."));
            }
        }
        return opcionComuna;
    }
    public void mostrarInforRutasIntermunicipal(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge una opcion: ");
        Integer opcionComuna=(int)Double.parseDouble(teclado.next().trim().replace(",","."));
        if (opcionComuna>=6 || opcionComuna<=0){
            opcionComuna= validarCase(opcionComuna);
        }
        switch (opcionComuna){
            case 1:
                infoRutaPasca();

                break;
            case 2:
                infoRutaArbalaez();
                break;
            case 3:
                infoRutaChinauta();
                break;
            case 4:
                infoRutaSilvania();
                break;
            case 5:
                infoRutaAguaBonita();
                break;
            case 6:
                infoRutaTibacuy();
                break;
            case 7:
                infoRutaNovillero();
            default:
                System.out.println("opcion invalido, vuelvelo a intentarlo");
        }

    }




}
