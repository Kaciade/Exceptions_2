import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели число: " + userInput);
    }
    
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float input;
        
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                input = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                scanner.nextLine(); // Clear the scanner buffer
            }
        }
        
        scanner.close();
        return input;
    }
}