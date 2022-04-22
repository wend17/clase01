import java.util.Locale;

public class APruebas {
    public static void main(String[] args) {
        String nombre = "Andres";

        System.out.println("caracteres= " + nombre.length());
        System.out.println("convertir en mayúscula = " + nombre.toUpperCase());
        System.out.println("convertir en minúscula= " + nombre.toLowerCase());
        System.out.println("comparación = " + nombre.equals("Andres"));
        System.out.println("comparación2 = " + nombre.equals("andres"));
        System.out.println("comparación3 = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("comparación4 = " + nombre.compareTo("andres")); // igual al equal, si sale 0, es
        System.out.println("traer carácter = " + nombre.charAt(0));
        System.out.println("desde el carácter = " + nombre.substring(1));
        System.out.println("desde, sin incluir el hasta = " + nombre.substring(1,4));

        String trabalenguas = "trabalenguas";
        System.out.println("remplazo un caracter por otro = " + trabalenguas.replace("a","."));
        System.out.println("primera posición del caracter o palabra= " + trabalenguas.indexOf('a')); // acepta string y caracter y
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // si no existe el caracter la posicion será negativa
        System.out.println(" acepta solo string ,respuesta es boolean  = " + trabalenguas.contains("t"));
        System.out.println(" empieza con ......= " + trabalenguas.startsWith("lenguas"));
        System.out.println("termina con tr = " + trabalenguas.endsWith("tr"));
        System.out.println("  trabalenguas  ".trim()); // para quitar espacios

        String archivo = "imagen.html";
        int i = archivo.lastIndexOf(".");
        System.out.println("obteniendo extención = " + archivo.substring(i+1));
    }
}
