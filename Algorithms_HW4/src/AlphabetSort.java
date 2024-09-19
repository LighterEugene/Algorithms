import java.util.Arrays;

public class AlphabetSort {

    // Алгоритм слияния для сортировки строки
    public static char[] mergeSort(char[] array) {
        if (array.length < 2) {
            return array; // Базовый случай для рекурсии
        }

        int mid = array.length / 2;
        char[] left = Arrays.copyOfRange(array, 0, mid);
        char[] right = Arrays.copyOfRange(array, mid, array.length);

        return merge(mergeSort(left), mergeSort(right)); // Рекурсивно делим и сливаем
    }

    // Функция для слияния двух отсортированных массивов
    public static char[] merge(char[] left, char[] right) {
        char[] result = new char[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "poiuytrewqlkjhgfdsamnbvcxz";
        char[] charArray = input.toCharArray();

        // Сортировка массива символов
        char[] sortedArray = mergeSort(charArray);

        // Преобразование в строку и вывод результата
        String sortedString = new String(sortedArray).toUpperCase();
        System.out.println(sortedString); // Вывод: ABCDEFGHIJKLMNOPQRSTUVWXYZ
    }
}
