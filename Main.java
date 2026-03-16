public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from branch 1!");
        System.out.println("Goodbye from branch 1!");
        
        // Используем новый калькулятор
        Calculator calc = new Calculator();
        int sum = calc.add(10, 5);
        calc.showResult(sum);
    }
    
    public static void printMessage(String message) {
        System.out.println("Message from branch 1: " + message);
    }
    
    // Новый метод в ветке 1
    public static void branchFeature() {
        System.out.println("Это новая функция в ветке 1");
    }
}
