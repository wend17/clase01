public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte pepito = 127;
        System.out.println("numeroByte = " + pepito);

        System.out.println("tipo byte corresponde en byte a = " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a = " + Byte.SIZE);
        System.out.println("valor máximo de un byte = " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte = " + Byte.MIN_VALUE);

        short numeroShort= 32767;
        System.out.println("numero short = " + numeroShort);
        System.out.println("tipo short corresponde en byte a = " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a = " + Short.SIZE);
        System.out.println("valor máximo de un short = " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short = " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numero numeroInt = " + numeroInt);

        System.out.println("tipo int corresponde en byte a = " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a = " + Integer.SIZE);
        System.out.println("valor máximo de un int = " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int = " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numero numeroLong = " + numeroLong);

        System.out.println("tipo long corresponde en byte a = " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a = " + Long.SIZE);
        System.out.println("valor máximo de un long = " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long = " + Long.MIN_VALUE);

    }
}
