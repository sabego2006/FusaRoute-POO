import java.util.ArrayList;
import java.util.Scanner;

public class RutaUrbana extends Ruta {
    //Hereda los atributos de su padre
    ArrayList<String> comunas = new ArrayList<>();
    ArrayList<String> barriosComunaCentro = new ArrayList<>();
    ArrayList<String> barriosComunaNorte = new ArrayList<>();
    ArrayList<String> barriosComunaOccidental = new ArrayList<>();
    ArrayList<String> barriosComunaOriental = new ArrayList<>();
    ArrayList<String> barriosComunaSurOriental = new ArrayList<>();
    ArrayList<String> barriosComunaSurOccidental = new ArrayList<>();
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

    public RutaUrbana() {
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

    }


    public void barrioComuna(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge una opcion: ");
        Integer opcionComuna=(int)Double.parseDouble(teclado.next().trim().replace(",","."));
        switch (opcionComuna){
            case 1:
                nombreBarrioComunaCentro();
                break;
            case 2:
                nombreBarrioComunaNorte();
        }
    }
    String[][] barriosPorComuna = {
            {"Potosi", "Luxemburgo", "Galeria"}, // Centro
            {"Gaitan", "La Cabaña", "El Eden", "Carlos Lleras", "Villa Natalia"}, // Norte
            {"San Mateo", "Manila", "Convoy", "Caney", "Santa Anita"}, // Occidental
            {"Pekin", "Coburgo", "Bonet", "Los Sauces"}, // Oriental
            {"Llano Largo", "La Pampa", "Coviproof", "Maiz Amarillo", "Ebenezer", "Llano Verde", "Gran Colombia", "San Francisco"}, // Sur Occidente
            {"Balmoral", "Fusacatan", "La Macarena", "EL Vergel", "San Fernando", "Camino Real"} //Sur Oriente
    };

    public RutaUrbana(String[][] barriosPorComuna) {
        this.barriosPorComuna = barriosPorComuna;
    }

    public RutaUrbana(String rutaSurOriente, String[] comunas, String s, String s1) {
    }
}