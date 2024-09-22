import java.util.Arrays;

// Класс Person с полями name и age
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class MergeSortPerson {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };
        System.out.println("Неотсортированные люди по возрасту: " + Arrays.toString(people));
        Person[] sortedPeople = mergeSort(people);
        System.out.println("Отсортированные люди по возрасту: " + Arrays.toString(sortedPeople));
    }

    // Основной метод сортировки
    public static Person[] mergeSort(Person[] array) {
        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;
        Person[] left = Arrays.copyOfRange(array, 0, mid);
        Person[] right = Arrays.copyOfRange(array, mid, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    // Метод слияния для Person
    public static Person[] merge(Person[] left, Person[] right) {
        Person[] result = new Person[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Сравниваем и сливаем в порядке убывания
        while (i < left.length && j < right.length) {
            if (left[i].age >= right[j].age) { // Сортировка по убыванию возраста
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
