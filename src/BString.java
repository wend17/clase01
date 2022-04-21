import java.util.Locale;

public class BString {
    public static void main(String[] args) {

        String nombre = "Andres";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); // si es cero es true
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.charAt(0));

        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.charAt(1));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.substring(2));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.substring(1,4));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.substring(nombre.length()-1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); // si lo contiene
        System.out.println("trabalenguas = " + trabalenguas.startsWith("tr")); // empieza con
        




    }

    }
