import java.util.InputMismatchException;
import java.util.Scanner;

public class PR9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое целое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Результат деления: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не целое число.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль.");
        } finally {
            System.out.println("Завершение программы.");
            scanner.close();
        }
    }
}