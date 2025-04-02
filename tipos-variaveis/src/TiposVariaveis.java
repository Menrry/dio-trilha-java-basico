public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
     
     
     // Adaptación add cast to short
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        Short numeroCurto2 = (short) numeroNormal;

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao );

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao );

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao );

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao );

        concatenacao = "1"+ (1+1+1);
        System.out.println(concatenacao );

                 
    }
}
