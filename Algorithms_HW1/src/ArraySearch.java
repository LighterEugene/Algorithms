class ArraySearch {
    public static int findIndexFromEnd(int[] array, int target) {
        // Проходим по массиву с конца
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == target) {
                return i; // Возвращаем индекс, если нашли элемент
            }
        }
        return -1; // Если элемент не найден, возвращаем -1
    }
}

