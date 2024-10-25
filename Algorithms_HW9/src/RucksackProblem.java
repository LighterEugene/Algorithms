import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Item {
    int weight;
    int value;
    double valuePerWeight;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.valuePerWeight = (double) value / weight;
    }

    @Override
    public String toString() {
        return "Предмет: вес = " + weight + " кг, стоимость = $" + value + ", ценность = " + valuePerWeight;
    }
}

public class RucksackProblem {
    public static void main(String[] args) {
        int maxWeight = 10; // максимальная вместимость рюкзака в кг

        // Список предметов
        List<Item> items = new ArrayList<>();
        items.add(new Item(2, 10));
        items.add(new Item(3, 15));
        items.add(new Item(5, 25));
        items.add(new Item(7, 35));

        // Сортируем предметы по убыванию ценности
        items.sort(Comparator.comparingDouble(item -> -item.valuePerWeight));

        int currentWeight = 0; // текущий вес рюкзака
        int totalValue = 0;    // общая стоимость предметов в рюкзаке
        List<Item> selectedItems = new ArrayList<>(); // список выбранных предметов

        // Проходим по предметам и добавляем их в рюкзак
        for (Item item : items) {
            if (currentWeight + item.weight <= maxWeight) {
                selectedItems.add(item);
                currentWeight += item.weight;
                totalValue += item.value;
            }
        }

        // Вывод результатов
        System.out.println("Выбранные предметы:");
        for (Item item : selectedItems) {
            System.out.println(item);
        }
        System.out.println("Общая стоимость: $" + totalValue);
        System.out.println("Общий вес: " + currentWeight + " кг");
    }
}
