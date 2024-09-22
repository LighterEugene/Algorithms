import java.util.Arrays;

public class MergeSortDescending {

    public static void main(String[] args) {
        int[] grades = {3, 8, 1, 9, 4, 2, 7, 6, 5};
        System.out.println("Не отсортированые оценки:  " + Arrays.toString(grades));
        int[] sortedGrades = mergeSort(grades);
        System.out.println("Отсортированные оценки: " + Arrays.toString(sortedGrades));
    }

    // Основной метод сортировки
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2; // Разделяем массив на две части
        int[] left = Arrays.copyOfRange(array, 0, mid); // Левая часть
        int[] right = Arrays.copyOfRange(array, mid, array.length); // Правая часть

        return merge(mergeSort(left), mergeSort(right)); // Рекурсивно сортируем обе части и сливаем
    }

    // Метод слияния отсортированных частей
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Сливаем элементы в порядке убывания
        while (i < left.length && j < right.length) {
            if (left[i] >= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Если остались элементы в левой части
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Если остались элементы в правой части
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
