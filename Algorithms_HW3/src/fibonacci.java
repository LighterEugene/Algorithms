public class fibonacci {
        public static void main(String[] args) {
            int N = 10;  // Выводим первые 10 чисел Фибоначчи
            for (int i = 0; i < N; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        // Рекурсивный метод для вычисления n-го числа Фибоначчи
        public static int fibonacci(int n) {
            if (n == 0) {
                return 0;  // Базовый случай: F(0) = 0
            } else if (n == 1) {
                return 1;  // Базовый случай: F(1) = 1
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);  // Рекурсивное определение
            }
        }
    }


