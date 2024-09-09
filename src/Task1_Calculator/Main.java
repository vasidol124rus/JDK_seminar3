package Task1;

//1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//sum(), multiply(), divide(), subtract().
//Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
//Методы должны возвращать результат своей работы.

public class Main {
    public static void main(String[] args) {
        System.out.println("Сумма: " + Calculator.sum(10,5.5));
        System.out.println("Умножение: " + Calculator.multiply(5.5,3));
        System.out.println("Деление: " + Calculator.divide(8.2,0));
        System.out.println("Разность: " + Calculator.subtract(9,5));
    }
}
