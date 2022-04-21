public class APruebas {
    public static void main(String[] args) {

        String numero ="50";
        int numeroInt = Integer.parseInt(numero);
        System.out.println("numeroInt = " + numeroInt);

        String realStr =" 98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

    }
}
