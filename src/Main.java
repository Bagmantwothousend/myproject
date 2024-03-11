import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Ошибка, поле пустое");
        }
        String[] opr = str.split("\\+|\\-|\\*|\\/");
        if (opr.length != 2) {
            throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
            num1 = Integer.parseInt(opr[0]);
            num2 = Integer.parseInt(opr[1]);


        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new IllegalArgumentException("Числа должны быть от 1 до 10");
        }
        String operation = str.replaceAll("[^\\+\\-\\*\\/]", "");


        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Неизвестная операция");
        }

        System.out.println(result);
    }
}