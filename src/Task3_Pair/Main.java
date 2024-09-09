package Task3_Pair;

//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
//а также переопределение метода toString(), возвращающее строковое представление пары.
//Работу сдать в виде ссылки на гит репозиторий.

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 10);
        System.out.println(pair1); // (Hello, 10)

        Pair<Integer, Double> pair2 = new Pair<>(5, 3.14);
        System.out.println(pair2); // (5, 3.14)

        System.out.println("Первый элемент пары 1: " + pair1.getFirst()); // Hello
        System.out.println("Второй элемент пары 2: " + pair2.getSecond()); // 3.14
    }
}
