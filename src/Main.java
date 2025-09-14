public class Main {
    public static void main(String[] args) {
        try {
            FastStack stack = new FastStack(10);

            System.out.println("=== Тест 1: Пустой стек ===");
            System.out.println("Пустой: " + stack.isEmpty());
            System.out.println("Размер: " + stack.size());

            System.out.println("\n=== Тест 2: Добавление элементов ===");
            stack.push(5);
            stack.push(3);
            stack.push(8);
            stack.push(2);

            System.out.println("Максимум: " + stack.maxPeek()); // Должен быть 8
            System.out.println("Размер: " + stack.size()); // Должен быть 4

            System.out.println("\n=== Тест 3: Удаление элементов ===");
            System.out.println("Pop: " + stack.pop()); // Должен быть 2
            System.out.println("Максимум: " + stack.maxPeek()); // Должен быть 8

            System.out.println("Pop: " + stack.pop()); // Должен быть 8
            System.out.println("Максимум: " + stack.maxPeek()); // Должен быть 5

            System.out.println("\n=== Тест 4: Добавление одинаковых максимумов ===");
            stack.push(5);
            stack.push(5);
            System.out.println("Максимум: " + stack.maxPeek()); // Должен быть 5

            System.out.println("Pop: " + stack.pop()); // Должен быть 5
            System.out.println("Максимум: " + stack.maxPeek()); // Должен быть 5

            System.out.println("Pop: " + stack.pop()); // Должен быть 5
            System.out.println("Максимум: " + stack.maxPeek()); // Должен быть 5

            System.out.println("\n=== Тест 5: Проверка contains ===");
            System.out.println("Содержит 3: " + stack.contains(3)); // Должен быть true
            System.out.println("Содержит 999: " + stack.contains(999)); // Должен быть false

            System.out.println("\n=== Тест 6: Peek ===");
            System.out.println("Peek: " + stack.peek()); // Должен быть 3
            System.out.println("Размер остался: " + stack.size()); // Должен быть 2

            System.out.println("\n=== Тест 7: Последовательные удаления ===");
            while (!stack.isEmpty()) {
                System.out.println("Pop: " + stack.pop() + ", Максимум: " +
                        (stack.isEmpty() ? "стек пуст" : stack.maxPeek()));
            }

            System.out.println("\n=== Тест 8: Исключения ===");
            try {
                stack.pop();
            } catch (StackException e) {
                System.out.println("Поймано исключение при pop() на пустом стеке");
            }

            try {
                stack.maxPeek();
            } catch (StackException e) {
                System.out.println("Поймано исключение при maxPeek() на пустом стеке");
            }

        } catch (Exception e) {
            System.out.println("Неожиданная ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}