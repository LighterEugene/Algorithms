import java.util.Arrays;

public class ArrayExpansion {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int additionalElements = 3; // Добавим 3 новых элемента

        int[] expandedArray = expandArray(originalArray, additionalElements);
        System.out.println("Новый массив: " + Arrays.toString(expandedArray));
    }

    public static int[] expandArray(int[] array, int newElements) {
        // Создаём новый массив, который вмещает исходный массив и новые элементы
        int[] newArray = Arrays.copyOf(array, array.length + newElements);

        // Заполняем новые элементы значениями (например, нулями или любыми другими значениями)
        for (int i = array.length; i < newArray.length; i++) {
            newArray[i] = 0; // Или любое другое значение
        }

        return newArray; // Возвращаем новый массив
    }
}
