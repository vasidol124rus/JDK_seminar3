package Task2_compareArrays;
//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
//        если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
//        но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.

import static Task2_compareArrays.CompareArrays.compareArrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intarr1 = {1, 7, -3};
        Integer[] intarr2 = {1, 7, -3};
        System.out.println(compareArrays(intarr1, intarr2)); // true

        String[] strArr1 = {"hello", "world"};
        String[] strArr2 = {"hello", "world"};
        System.out.println(compareArrays(strArr1, strArr2)); // true

        Integer[] intArr3 = {1, 2, 3};
        Integer[] intArr4 = {1, 2, 4};
        System.out.println(compareArrays(intArr3, intArr4)); // false

        String[] strArr3 = {"hello", "world"};
        String[] strArr4 = {"hello", "javac"};
        System.out.println(compareArrays(strArr3, strArr4)); // false
    }
}
