import java.util.ArrayList;
import java.util.Scanner;

public class RutaUrbana extends Ruta {
    //Hereda los atributos de su padre

   protected ArrayList<String> comunas = new ArrayList<>();
    protected ArrayList<String> barriosComunaCentro = new ArrayList<>();
    protected ArrayList<String> barriosComunaNorte = new ArrayList<>();
    protected ArrayList<String> barriosComunaOccidental = new ArrayList<>();
    ArrayList<String> barriosComunaOriental = new ArrayList<>();
    ArrayList<String> barriosComunaSurOriental = new ArrayList<>();
    ArrayList<String> barriosComunaSurOccidental = new ArrayList<>();
    public RutaUrbana() {
    }
    public void nombreComunas(){
        System.out.println("Estan son las comunas urbanas de Fusagasuga");
        comunas.add("Centro");
        comunas.add("Norte");
        comunas.add("Occidental");
        comunas.add("Oriental");
        comunas.add("Sur Occidente");
        comunas.add("Sur Oriente");

        for (int i=0; i<comunas.size(); i++){
            System.out.println((i+1)+": "+comunas.get(i));
        }

    }


    public void nombreBarrioComunaCentro(){
        barriosComunaCentro.add("Potosi");
        barriosComunaCentro.add("luxemburgo");
        barriosComunaCentro.add("Galeria");
        for (int i=0; i<barriosComunaCentro.size(); i++){
            System.out.println((i+1)+": "+barriosComunaCentro.get(i));
        }
    }
    public void nombreBarrioComunaNorte(){
        barriosComunaNorte.add("Gaitan");
        barriosComunaNorte.add("La Cabaña");
        barriosComunaNorte.add("El Eden");
        barriosComunaNorte.add("Carlos Lleras");
        barriosComunaNorte.add("Villa Natalia");
        for (int i=0; i<barriosComunaNorte.size(); i++){
            System.out.println((i+1)+": "+barriosComunaNorte.get(i));
        }
    }
    public void nombreBarrioComunaOccidental(){
        barriosComunaOccidental.add("San Mateo");
        barriosComunaOccidental.add("Manila");
        barriosComunaOccidental.add("convoy");
        barriosComunaOccidental.add("Caney");
        barriosComunaOccidental.add("Santa Anita");
        for (int i=0; i<barriosComunaOccidental.size(); i++){
            System.out.println((i+1)+": "+barriosComunaOccidental.get(i));
        }
    }
    public void nombreBarriosComunaOriental(){
        barriosComunaOriental.add("Pekin");
        barriosComunaOriental.add("Coburgo");
        barriosComunaOriental.add("Bonet");
        barriosComunaOriental.add("Sauces");
        for (int i=0; i<barriosComunaOriental.size(); i++){
            System.out.println((i+1)+": "+barriosComunaOriental.get(i));
        }
    }

    public void nombreBarriosComunaSurOccidente(){
        barriosComunaSurOccidental.add("llano largo");
        barriosComunaSurOccidental.add("La Pampa");
        barriosComunaSurOccidental.add("Coviproof");
        barriosComunaSurOccidental.add("Maiz Amarillo");
        barriosComunaSurOccidental.add("Ebenezer");
        barriosComunaSurOccidental.add("Llano Verde");
        barriosComunaSurOccidental.add("Gran Colombia");
        barriosComunaSurOccidental.add("San francisco");
        for (int i=0; i<barriosComunaSurOccidental.size(); i++){
            System.out.println((i+1)+": "+barriosComunaSurOccidental.get(i));
        }
    }
    public void nombreBarriosComunaSurOriente(){
        barriosComunaSurOriental.add("Barmoral");
        barriosComunaSurOriental.add("Fusacatan");
        barriosComunaSurOriental.add("La Macarena");
        barriosComunaSurOriental.add("El Vergel");
        barriosComunaSurOriental.add("San Fernando");
        barriosComunaSurOriental.add("Camino Real");
        for (int i=0; i<barriosComunaSurOriental.size(); i++){
            System.out.println((i+1)+": "+barriosComunaSurOriental.get(i));
        }
    }

    public Integer validarCase(Integer opcionComuna){
        Scanner teclado = new Scanner(System.in);
        if (opcionComuna>=6 || opcionComuna<=0){
            while (opcionComuna>=6 || opcionComuna<=0){
                System.out.println("numero incorrecot, vuelelo a intentar");
                opcionComuna=(int)Double.parseDouble(teclado.next().trim().replace(",","."));
            }
        }
        return opcionComuna;
    }


    public void barrioComuna(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge una opcion: ");
        Integer opcionComuna=(int)Double.parseDouble(teclado.next().trim().replace(",","."));
        if (opcionComuna>=6 || opcionComuna<=0){
            opcionComuna= validarCase(opcionComuna);
        }
        switch (opcionComuna){
            case 1:
                nombreBarrioComunaCentro();
                break;
            case 2:
                nombreBarrioComunaNorte();
                break;
            case 3:
                nombreBarrioComunaOccidental();
                break;
            case 4:
                nombreBarriosComunaOriental();
                break;
            case 5:
                nombreBarriosComunaSurOccidente();
                break;
            case 6:
                nombreBarriosComunaSurOriente();
                break;
            default:
                System.out.println("opcion invalido, vuelvelo a intentarlo");
        }
    }

}