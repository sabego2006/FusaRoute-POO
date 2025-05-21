public class RutaGranColombia extends RutaUrbana {

    public RutaGranColombia(){
            super("Gran Colombia", "Ebenezer", "San Antonio", "Tiempo estimado 15 min a 20 min ", "Panamericana el indio, Escuela policia", "$2.300");
        }

        @Override
        public void mostrarInfoRuta(){
            System.out.println(" Ruta Urbana:" + getNombre());
            System.out.println(" Paraderos: " + getRutaInicio() + getRutaFinal() );
            System.out.println(" Frecuencia estimada: " + getTiempoEstimado());
            System.out.println(" Información: " + getInformacion());
            System.out.println(" Costo: " + getCosto());
        }

    }





