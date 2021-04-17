public class Checker {


    public static void main(String[] args) {
        String x = "Иванов Djdfy";
        String y = "иванов иван";

        CheckUserName(x, y);
    }

    private static void CheckUserName(String x, String y) {
        if(x.equalsIgnoreCase(y)){
            System.out.println("imya zanyato");
        } else {
            System.out.println("imya gut");
            System.out.println("Ваше имя имеет длину " + x.length() + " символов");
        }
    }
}
