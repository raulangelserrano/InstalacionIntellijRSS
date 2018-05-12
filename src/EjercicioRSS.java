/**
 * @author : Raúl Serrano Sánchez
 * @version :0.0.1,12/05/2018
 *
 */
public class EjercicioRSS {



    public static void main( String[] args){

        System.out.println("La calificación de " + args[0] + " : ");

        System.out.println(veredicto(args[1],args[2]));

    }

    static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
             return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }

}
