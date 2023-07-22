import service.Devilery;
import service.Os;
import service.Year;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner1.nextInt();
        Year.toDetermineYear(year);


    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите тип операционой системы: 0 - ios, 1 - Android");
        int typeOs = scanner2.nextInt();
        System.out.println(" Введите год выпуска устройства ");
        int yearMobile = scanner2.nextInt();
        Os.printOs(yearMobile, typeOs);

    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner3 = new Scanner(System.in);
        System.out.println(" Введите расстояние до адреса доставки");
        int distance = scanner3.nextInt();


    }


}