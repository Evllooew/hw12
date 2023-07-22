package service;

public class Os {

    public static void printOs(int year, int typeOs) {
        switch (typeOs) {
            case 0:
                if (year < 2015) {
                    System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
                } else System.out.println(" Установите версию приложения для iOS по ссылке");

                break;
            case 1:
                if (year < 2015) {
                    System.out.println(" Установите облегченную версию приложения для Android по ссылке");
                }
                System.out.println(" Установите  версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Купи нормальный телефон");
                break;

        }
    }
}
