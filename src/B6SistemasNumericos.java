public class B6SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500 ;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("numeroOctal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("numeroHexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));


        int numeroBinario = 0b111110100;
        System.out.println("numeroDecimal = " + numeroBinario);

        int numeroOctal=0764;
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);






    }
}
