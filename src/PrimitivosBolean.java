public class PrimitivosBolean {
    public static void main(String[] args) {
        boolean datologico = true;
        System.out.println("datologico = " + datologico);
        
        boolean esIgual =(3-2==1);
        System.out.println("esIgual = " + esIgual);

        double d = 98765.43e-3;
        float f = 123456e2f;

        datologico = d>f;
        System.out.println("datologico = " + datologico);
        
    }
}
