import java.util.ArrayList;
import java.util.Scanner;

public class RutaInterMunicipal {
    //Hereda los atributos de su papa


    protected String destino;
    protected String inicioruta;
    protected String finruta;
    protected String horainicio;
    protected String horafin;
    protected String FrecuenciaBus;

    RutaArbelaez rutaArbelaez = new RutaArbelaez();

    public RutaInterMunicipal() {
    }

    public RutaInterMunicipal(String destino, String inicioruta, String finruta, String horainicio, String horafin, String frecuenciaBus) {

        this.destino = destino;
        this.inicioruta = inicioruta;
        this.finruta = finruta;
        this.horainicio = horainicio;
        this.horafin = horafin;
        FrecuenciaBus = frecuenciaBus;
    }

    public void mostrarInfoRuta() {

    }






    public static Integer validarCase(Integer opcionComuna) {
        Scanner teclado = new Scanner(System.in);
        if (opcionComuna >= 6 || opcionComuna <= 0) {
            while (opcionComuna >= 6 || opcionComuna <= 0) {
                System.out.println("numero incorrecot, vuelelo a intentar");
                opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
            }
        }
        return opcionComuna;
    }

    public void mostrarInforRutasIntermunicipal() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge una opcion: ");
        Integer opcionComuna = (int) Double.parseDouble(teclado.next().trim().replace(",", "."));
        if (opcionComuna >= 6 || opcionComuna <= 0) {
            opcionComuna = validarCase(opcionComuna);
        }
        switch (opcionComuna) {
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getInicioruta() {
        return inicioruta;
    }

    public void setInicioruta(String inicioruta) {
        this.inicioruta = inicioruta;
    }

    public String getFinruta() {
        return finruta;
    }

    public void setFinruta(String finruta) {
        this.finruta = finruta;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public String getFrecuenciaBus() {
        return FrecuenciaBus;
    }

    public void setFrecuenciaBus(String frecuenciaBus) {
        FrecuenciaBus = frecuenciaBus;


    }
}
