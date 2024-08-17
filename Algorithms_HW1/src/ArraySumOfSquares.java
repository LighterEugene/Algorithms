class ArraySumOfSquares {
    public static int sumOfSquares(int[] array) {
        int sum = 0;
        // Проходим по массиву
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * array[i]; // Добавляем квадрат текущего элемента к сумме
        }
        return sum; // Возвращаем сумму квадратов
    }


}
