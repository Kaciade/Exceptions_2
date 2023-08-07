public class Task_3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            // abc[3] = 9; данная строка не нужна
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        // блоки были расставлены в неправильной последовательности
    }
    
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
