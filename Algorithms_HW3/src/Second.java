public class Second {
        public static void main(String[] args) {
            int N = 55555;  // Пример числа
            int sum = sumOfDigits(N);
            System.out.println(sum);  // Вывод суммы цифр числа
        }

        // Рекурсивный метод для вычисления суммы цифр
        public static int sumOfDigits(int N) {
            if (N < 10) {
                return N;  // Базовый случай: если число однозначное, возвращаем его
            } else {
                return (N % 10) + sumOfDigits(N / 10);  // Рекурсивный вызов, остаток 10 вернёт последнее число, деление на 10 убирает его и далее рекурсия
            }
        }
    }


