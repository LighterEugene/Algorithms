public class FindKthElement {

    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int i = 0, j = 0, count = 0;
        int result = -1;

        // Пробегаем по массивам до тех пор, пока не достигнем k-й позиции
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result = arr1[i];
                i++;
            } else {
                result = arr2[j];
                j++;
            }
            count++;

            // Если достигли k-й позиции, выходим из цикла
            if (count == k) {
                return result;
            }
        }

        // Если один из массивов закончился, продолжаем другой
        while (i < arr1.length) {
            result = arr1[i];
            i++;
            count++;
            if (count == k) {
                return result;
            }
        }

        while (j < arr2.length) {
            result = arr2[j];
            j++;
            count++;
            if (count == k) {
                return result;
            }
        }

        return result; // Возвращаем результат
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 9;

        // Находим элемент на k-й позиции
        int kthElement = findKthElement(arr1, arr2, k);

        // Выводим результат
        System.out.println("Элемент на " + k + "-й позиции: " + kthElement);
    }
}
