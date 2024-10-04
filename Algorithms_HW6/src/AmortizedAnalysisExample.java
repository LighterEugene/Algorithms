/*Амортизированный анализ — это метод оценки средней производительности операций в долгосрочной перспективе,
 даже если некоторые операции могут занимать больше времени. Примером является динамическое увеличение
 размера массива.

 Пример: динамическое расширение массива
 Когда вы добавляете элементы в динамический массив (например, ArrayList в Java), иногда происходит перераспределение памяти: когда массив заполняется, создаётся новый массив большего размера,
  и все элементы копируются в него. Хотя копирование всех элементов — это дорогая операция, она происходит редко, и за большое количество вставок её стоимость "распределяется" на все операции. Таким образом, среднее время добавления элемента в динамический массив остаётся константным, несмотря на то, что иногда вставка требует больше времени.
 Амортизированный анализ позволяет утверждать, что добавление элемента в динамический массив занимает O(1) в среднем, даже если в худшем случае это может быть O(n), когда массив удваивается.
 В Java класс ArrayList — это динамический массив, который может автоматически увеличивать свой размер при добавлении новых элементов. Когда текущий массив переполняется, создаётся новый, большего размера, и все элементы копируются в него.
  */
import java.util.Arrays;

public class AmortizedAnalysisExample {
    public static void main(String[] args) {
        // Начальный массив с ёмкостью 2
        DynamicArray dynamicArray = new DynamicArray(2);

        // Добавляем 5 элементов
        for (int i = 1; i <= 5; i++) {
            dynamicArray.add(i);
        }
    }
}

class DynamicArray {
    private int[] array;   // Внутренний массив
    private int size;      // Текущий размер массива (количество элементов)

    // Конструктор для инициализации массива с определённой ёмкостью
    public DynamicArray(int initialCapacity) {
        array = new int[initialCapacity]; // Начальный массив
        size = 0;                         // Изначально элементов нет
    }

    // Метод для добавления элемента в массив
    public void add(int value) {
        // Если массив заполнен, увеличиваем его размер в 2 раза
        if (size == array.length) {
            grow();
        }

        // Добавляем элемент и увеличиваем размер
        array[size] = value;
        size++;

        // Выводим текущее состояние массива после добавления элемента
        System.out.println("Добавлен элемент: " + value);
        System.out.println("Текущий массив: " + Arrays.toString(array));
    }

    // Метод для увеличения массива в 2 раза
    private void grow() {
        // Увеличиваем размер массива в 2 раза
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);

        // Выводим информацию о росте массива
        System.out.println("Размер массива увеличен до " + newCapacity);
    }
}
/*
Амортизированный анализ:
При каждом удвоении массива происходит операция копирования всех элементов в новый массив.
Это занимает O(n) времени, где n — текущий размер массива.
Однако такие удвоения происходят редко — только когда массив полностью заполнен.
В большинстве случаев добавление элемента занимает O(1) (константное время), если массив не переполнен.
Таким образом, хотя добавление элемента иногда занимает O(n) (когда массив удваивается),
 в среднем на большое количество операций добавления добавление занимает O(1) времени.
 Это и есть пример амортизированного анализа: в долгосрочной перспективе,
 стоимость таких операций равномерно распределяется по всем добавлениям,
 и в среднем операция выполняется за O(1).

Заключение:
Этот пример с динамическим расширением массива показывает, как амортизированный анализ позволяет утверждать,
что операция вставки в динамический массив (или ArrayList в Java) выполняется в O(1) времени в среднем,
 даже если время выполнения некоторых операций — O(n).
 */

