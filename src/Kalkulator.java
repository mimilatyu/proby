
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое 1число >>>");
            int operand1 = scanner.nextInt();
            System.out.println("Введите знак, используя '+', '-', '*', '/' >>>");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите второе число >>>");
            int operand2 = scanner.nextInt();
            int result = 0;

            switch(operation) {
                case '+':
                    result = operand1+operand2;
                    System.out.println("Результат решения примера: " + result);
                    break;
                case '-':
                    result = operand1-operand2;
                    System.out.println("Результат решения примера: " + result);
                    break;
                case '*':
                    result = operand1*operand2;
                    System.out.println("Результат решения примера: " + result);
                    break;
                case '/':
                    result =  operand1/operand2;
                    System.out.println("Результат решения примера: " + result);
                    break;

                    default:
                    System.out.println("Бля, ну я же просил использовать знаки +, -, *, /, давай по новой дифичендо");
            }

            int next = scanner.nextInt();


        }
    }
}

