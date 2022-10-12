public class Main {
    public static void main(String[] args) {

        int numero = 0;

        while (numero < 3 ){
            System.out.println(numero);
            numero++;

            if (numero > 0){
                System.out.println("es positivo");
                if (numero < 0){
                    System.out.println("es negativo");
                    if (numero == 0){
                        System.out.println("es 0");

                    }

                }
            }
        }
    }
}
