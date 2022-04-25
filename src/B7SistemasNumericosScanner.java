import java.util.InputMismatchException;
import java.util.Scanner;

public class B7SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número entero");

            int numeroDecimal=0;

            try{
                numeroDecimal=scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Error al ingresar a consola");
                main(args);
                System.exit(0);
            }

           String mensajeDecimal=" número = " + numeroDecimal;
           String mensajeBinario="numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            String mensajeOctal ="numeroOctal " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            String mensajeHex = "numeroHexadecimal " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

          String mensaje = mensajeDecimal;
         mensaje += "\n" + mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;

        System.out.println(mensaje);










    }
    }


