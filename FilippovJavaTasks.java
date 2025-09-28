import java.util.Scanner;

public class IvanovJavaTasks {
    
    // Задача 1: Сравнение и операции с числами
    public static void numberOperations() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 1: Операции с числами ===");
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();
        
        // Сравнение
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Арифметические операции
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));
        
        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("Деление: " + a + " / " + b + " = " + ((double)a / b));
        } else {
            System.out.println("Деление: невозможно (деление на ноль)");
        }
        
        System.out.println();
    }
    
    // Задача 2: Сравнение строк
    public static void stringComparison() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 2: Сравнение строк ===");
        scanner.nextLine(); // Очистка буфера
        
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine();
        
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();
        
        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        System.out.println();
    }
    
    // Задача 3: Четные числа из массива
    public static void evenNumbers() {
        System.out.println("=== Задача 3: Четные числа из массива ===");
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.print("Исходный массив: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.print("Четные числа: ");
        boolean firstEven = true;
        for (int number : numbers) {
            if (number % 2 == 0) {
                if (!firstEven) {
                    System.out.print(", ");
                }
                System.out.print(number);
                firstEven = false;
            }
        }
        System.out.println();
    }
    
    // Главный метод
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Выполнение всех задач
        numberOperations();
        stringComparison();
        evenNumbers();
        
        scanner.close();
        System.out.println("\n=== Все задачи выполнены ===");
    }
}
