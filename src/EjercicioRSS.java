

public class EjercicioRSS {



    public static void main( String[] args){

        System.out.println("La calificación de " + args[0] + " : ");

        System.out.println(veredicto(args[1],args[2]));

    }

    /**
     *
     * @param valor1 Indica la calificación que el alumno desea conseguir en el módulo
     * @param valor2 Indica la calificación que realmente has conseguido.
     * @return El método devuelve un String en función de los valores introducidos:
     *     Si valor1==valor2 devuelve "Perfecto. Has tenido buen criterio."
     *     Si valor1 < valor2 devuelve "Has mejorado, o te ha llegado el éxito inesperado."
     *     Si valor1 > valor2 devuelve "Te has confiado. Falta realismo.";
     */
    private static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
             return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }

}
