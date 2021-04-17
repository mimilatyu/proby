public class Person {
    private static String name = "Ksysha";
    private static int age = 48;
    private static boolean sex = true;

    public static void main(String[] args) {
        if (sex==true) {
            if (age>=18 && age<27) {
                System.out.println("Человек " + name + " по возрасту подходит для службы в армии");
            } else {
                System.out.println("Человек " + name + " либо слишком молод, либо слишком стар для службы в армии");
            }
        } else {
            int count = 0;
            for (int i = age; i<=131; i++) {
                count++;
            }
            System.out.println("Женщине " + name + " до рекорда продолжительности жизни осталось "+ count + " лет" );
        }
    }
}
