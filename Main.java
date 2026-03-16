public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from main branch!");
        
        // Используем утилиты
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("Array:");
        Utils.printArray(numbers);
        System.out.println("Max value: " + Utils.findMax(numbers));
    }
    
    public static void printMessage(String message) {
        System.out.println("Main branch message: " + message);
    }
}
