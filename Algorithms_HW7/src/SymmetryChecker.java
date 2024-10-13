import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SymmetryChecker {

    // Проверка симметричности списка
    public static boolean isSymmetric(Node head) {
        if (head == null) {
            return true; // Пустой список симметричен
        }

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        // Определение длины списка
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        current = head;
        int halfLength = length / 2;

        // Добавляем первую половину элементов в очередь
        for (int i = 0; i < halfLength; i++) {
            queue.offer(current.data);
            current = current.next;
        }

        // Если список нечётный, пропускаем средний элемент
        if (length % 2 != 0) {
            current = current.next;
        }

        // Добавляем вторую половину элементов в стек
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        // Сравниваем элементы из очереди и стека
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false; // Если элементы не совпадают, список не симметричен
            }
        }

        return true; // Все элементы совпадают, список симметричен
    }

    public static void main(String[] args) {
        // Пример 1: Список 1 -> 2 -> 3 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println(isSymmetric(head)); // true

        // Пример 2: Список 1 -> 2 -> 3 -> 4
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);

        System.out.println(isSymmetric(head2)); // false
    }
}
//Для проверки, является ли односвязный список симметричным, мы можем использовать следующие шаги:
//
//Чтение первой половины списка и помещение её элементов в очередь.
//Чтение второй половины списка и помещение её элементов в стек.
//Сравнение элементов очереди и стека:
//Очередь хранит элементы первой половины в исходном порядке.
//Стек хранит элементы второй половины в обратном порядке.
//Если элементы совпадают, список симметричен.