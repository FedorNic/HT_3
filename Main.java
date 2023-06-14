/**
 * 1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой
 * (один из потомков) и фиксированной оплатой (второй потомок).
 * а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
 * Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
 * для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
 * б) Создать на базе абстрактного класса массив сотрудников и заполнить его.
 * в) ** Реализовать интерфейсы для возможности сортировки массива.
 * г) ** Создать класс, содержащий массив сотрудников, и реализовать возможность вывода данных с использованием foreach.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        FullTimeWorker fullTimeFirst = new FullTimeWorker("Fedor", "Dmitriev", 37, 94_500);
        FullTimeWorker fullTimeSecond = new FullTimeWorker("Maksim", "Sabanin", 42, 44_000);
        PartTimeWorker partTimeFirst = new PartTimeWorker("Anton", "Baikov", 36);
        PartTimeWorker partTimeSecond = new PartTimeWorker("Konstantine", "Melnikov", 56);
        Worker[] workers = new Worker[]{fullTimeFirst, fullTimeSecond, partTimeFirst, partTimeSecond};

        // Вывод в терминал по порядку добавления
        System.out.println();
        for (Worker people : workers) {
            System.out.println(people);
        }

        // Вывод в терминал после сортировки по фамилии
        Arrays.sort(workers);
        System.out.println();
        for (Worker people : workers) {
            System.out.println(people);
        }
        // Вывод в терминал после сортировки по возрасту через Comprator
        Arrays.sort(workers, Comparator.comparingInt(o -> o.age));
        System.out.println();
        for (Worker people : workers) {
            System.out.println(people);
        }
        //Вывод в терминал данных класса, содержащего массив через foreach
        System.out.println();
        Repository repository = new Repository(workers);
        for (Worker people : repository) {
            System.out.println(people);
        }
        System.out.println();
    }
}