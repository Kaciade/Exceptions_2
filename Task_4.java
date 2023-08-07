import java.util.Scanner;

public class Task_4 {
    public class EmptyStringExceptionExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("Введите строку:");
            String userInput = scanner.nextLine();
        
            try {
                if (userInput.isEmpty()) {
                    throw new Exception("Нельзя вводить пустые строки!");
                }
            
                System.out.println("Вы ввели: " + userInput);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
