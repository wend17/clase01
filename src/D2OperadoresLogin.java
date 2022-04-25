
import java.util.Scanner;

public class D2OperadoresLogin {
    public static void main(String[] args) {
        String username = "andres";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese el username");
        String u= new Scanner(System.in).nextLine();


        System.out.println("ingrese el pasword");
        String p = scanner.next();

        boolean esAutenticado = false;

        if (username.equals(u) && password.equals(p)) {
            esAutenticado = true;
        } else {
            System.out.println(" username  o contraseña incorrecta");
        }

        if (esAutenticado){
            System.out.println("bienvenido".concat(u).concat("!"));
        } else {
            System.out.println("lo siento, requiere autentificación");
        }



    }
}
