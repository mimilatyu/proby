
import java.io.IOException;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("введите телик");
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }


    private static boolean checkName(String phoneNumber) {
        //Написать код здесь
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        return clean.length() == 11;
    }

    private static String formatName(String name) {
        String clean = name.replaceAll("[^0-9]", "");
        String result = "+7" + " " + clean.substring(1,4) + " " + clean.substring(4,7) + " " + clean.substring(7,9) + " " + clean.substring(9);
        return result;

    }
}
