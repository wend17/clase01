/*import javax.swing.*;

public class SisNume1 {

       public static void main(String[] args) {

          String numStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
           int numeroDecimal = Integer.parseInt(numStr);

           System.out.println("numeroDecimal = " + numeroDecimal);
           System.out.println("numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
           System.out.println("numeroOctal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
           System.out.println("numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

           String mensaje = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
           mensaje += "\nnumeroOctal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
           mensaje += "\nnumeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
           JOptionPane.showMessageDialog(null,mensaje); */

import javax.swing.*;

public class SistemasNumericosVentanaDialogo {

    public static void main(String[] args) {
            String numStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");


            int numeroDecimal=0;
            try{
                numeroDecimal=Integer.parseInt(numStr);
            }catch (NumberFormatException e) {
                ;
                JOptionPane.showMessageDialog(null, "error ingrese un número entero");
                main(args);
                System.exit(0);
            }
            String mensajeDecimal="numeroDecimal = " + numeroDecimal;
            System.out.println(mensajeDecimal);
            String mensajeBinario="numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            System.out.println(mensajeBinario);
            String mensajeOctal ="numeroOctal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            System.out.println(mensajeOctal);
            String mensajeHex = "numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            System.out.println(mensajeHex);

            String mensaje = mensajeDecimal;
            mensaje += "\n" + mensajeBinario;
            mensaje += "\n" + mensajeOctal;
            mensaje += "\n" + mensajeHex;


        JOptionPane.showMessageDialog(null,mensaje);





        }
    }


