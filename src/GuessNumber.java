import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int randInt = rand.nextInt(10)+1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите число");
            int user = Integer.parseInt(reader.readLine());
            if(user==randInt) {
                System.out.println("Верно");
                break;
            }
            else if (user>randInt) {
                System.out.println("меньше");
            }
            else {
                System.out.println("загаданное число больше");
            }
        }
    }
}
