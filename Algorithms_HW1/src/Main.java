public class Main {
    public static void main(String[] args) {
        int[] array = {3, 6, 4, 7, 2, 1, 9};
        ArraySumOfSquares a = new ArraySumOfSquares();
        int sum = a.sumOfSquares(array);
        System.out.println("Сумма квадратов всех элементов массива: " + sum);

        ArraySearch b = new ArraySearch();
        int[] array2 = {3, 6, 4, 7, 2, 1, 9};
        int target = 7; // Число, индекс которого нужно найти

        int index = b.findIndexFromEnd(array2, target);

        if (index != -1) {
            System.out.println("Индекс элемента " + target + " в массиве: " + index);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве.");
        }
    }

}