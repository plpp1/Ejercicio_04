public class Main {
    public static void main(String[] args) {

        var estacion = "INVIERNO";

        switch (estacion){
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "VERANO":
                System.out.println("es verano");
                break;
            case "PRIMAVERA":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("no es una estacion");
        }

    }
}
