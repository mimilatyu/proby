import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parole {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        String name = reader.readLine();
        System.out.println("Введите пароль");
        String password = reader.readLine();
        if((password.length() < 8) || (password.length() > 15)) {
            do {
                System.out.println("Длина пароля от 8 до 15 символов");
                password = reader.readLine();
            } while (password.length()<8 || password.length()>15);
        }
        System.out.printf("%s, Ваш новый пароль: %s", name, password);
    }


}
