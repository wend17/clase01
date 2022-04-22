import javax.swing.*;

public class operadores {
    public static void main(String[] args) {

        int i = 5 , j =4 , suma = i+j , resta=i-j , multi=i*j , resto =i%j ;



        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multi = " + multi);
        System.out.println("resto = " + resto);
        
        int div = i/j ;
        float div2 = (float)i / (float)j;
        System.out.println("div2 = " + div2);






        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un número"));
        if(numero%2==0){
            System.out.println("par= " + numero);
        }else {
            System.out.println("impar = " + numero);
        }
                
//............................................................



    }
}
