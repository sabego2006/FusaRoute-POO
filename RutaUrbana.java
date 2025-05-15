public class RutaUrbana extends Ruta {
    //Hereda los atributos de su padre

    String[] comunas = {
            "Centro", "Norte", "Occidental", "Oriental", "Sur Occidente", "Sur Oriente"
    };

    String[][] barriosPorComuna = {
            {"Potosi", "Luxemburgo", "Galeria"}, // Centro
            {"Gaitan", "La Cabaña", "El Eden", "Carlos Lleras", "Villa Natalia"}, // Norte
            {"San Mateo", "Manila", "Convoy", "Caney", "Santa Anita"}, // Occidental
            {"Pekin", "Coburgo", "Bonet", "Los Sauces"}, // Oriental
            {"Llano Largo", "La Pampa", "Coviproof", "Maiz Amarillo", "Ebenezer", "Llano Verde", "Gran Colombia", "San Francisco"}, // Sur Occidente
            {"Balmoral", "Fusacatan", "La Macarena", "EL Vergel", "San Fernando", "Camino Real"} //Sur Oriente
    };

    public RutaUrbana(String[][] barriosPorComuna, String[] comunas) {
        this.barriosPorComuna = barriosPorComuna;
        this.comunas = comunas;
    }

    public RutaUrbana(String rutaSurOriente, String[] comunas, String s, String s1) {
    }
}