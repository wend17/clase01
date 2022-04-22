public class APruebas2 {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

       char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        for ( int i =0 ; i <largo ; i++){
            System.out.println(arreglo [i]);
        }


        //,.:::::::


        String trabalengua = "tra.bal.en.gu.a";
        System.out.println("trabalengua = " + trabalengua.split("a"));

        String[] arreglo2 = trabalengua.split("[.]"); // el punto va entre corchetes o antelando //, las letras entre comillas
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            ;
            System.out.println(arreglo2[j]);


        }

    }
}

