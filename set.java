import java.util.HashMap;

public class MySet<E> {
    // Хранит уникальные элементы множества
    private HashMap<E, Boolean> elements;

    // Конструктор
    public MySet() {
        elements = new HashMap<>();
    }

    // Добавляет элемент в множество
    public void add(E element) {
        elements.put(element, true);
    }

    // Проверяет принадлежность элемента множеству
    public boolean contains(E element) {
        return elements.containsKey(element);
    }

    // Удаляет элемент из множества
    public void remove(E element) {
        elements.remove(element);
    }

    // Проверяет пустоту множества
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Возвращает количество элементов
    public int size() {
        return elements.size();
    }

    // Преобразовывает множество в строку
    @Override
    public String toString() {
        return elements.keySet().toString();
    }

    // Точка входа для теста
    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // повторное добавление игнорируется

        System.out.println(set); // Вывод: [10, 20, 30]
        System.out.println("Размер множества: " + set.size()); // Вывод: 3

        System.out.println("Проверка принадлежности: " + set.contains(20)); // Вывод: true
        set.remove(20);
        System.out.println("Множество после удаления: " + set); // Вывод: [10, 30]
    }
}