import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Читаем число N

        // Проверяем, является ли N степенью двойки
        if (N > 0 && (N & (N - 1)) == 0) { // если число больше 0 и при сравнении числа
            // с предыдущим с использованием побитового И выходит равенство с нолем - условию удовлетворяет,
            // в противном случае нет.
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();  // Закрываем сканер
    }

}
