package service;

public class Devilery {
    public static int calculateDeviliryDay(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;

        }
    }
}