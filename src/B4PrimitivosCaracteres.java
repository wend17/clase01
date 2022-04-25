public class B4PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';//'0';//'9';
        System.out.println("carácter = " + caracter);

        char decimal = 64;
        System.out.println("decimal = " + decimal);

        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("símbolo = " + simbolo);

        System.out.println("decimal = símbolo = " + (simbolo == caracter));

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("máximo valor de un char = " + Character.MAX_VALUE);
        System.out.println("mínimo valor de un char = " + Character.MIN_VALUE);

        char espacio =' ';//'\u0020';
        System.out.println("char  corresponde en byte:" + espacio+ espacio+Character.BYTES);

        char retroceso ='\b'; //se puede usar dentro del texto
        System.out.println("char  corresponde en byte:" + retroceso + Character.BYTES);
        System.out.println("char  corresponde en byte:" + retroceso + retroceso+ retroceso + Character.BYTES);

        char tabulador = '\t';
        System.out.println("char  corresponde en byte:" + tabulador + tabulador + Character.BYTES);

        char nuevaLinea = '\n';
        System.out.println("char  corresponde en byte:" + nuevaLinea+ Character.BYTES);

        char retornoCarro = '\r';
        System.out.println("char  corresponde en byte:" + retornoCarro+ Character.BYTES);
        System.out.println("char  corresponde en byte:" + System.getProperty("line.separator")+ Character.BYTES);
        System.out.println("char  corresponde en byte:" + System.lineSeparator()+ Character.BYTES);


    }
}