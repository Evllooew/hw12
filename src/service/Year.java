package service;

public class Year {

    public static void toDetermineYear(int year) {

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " - Год високостный");
        } else System.out.println(year + " - Год не високостный");
    }
}
