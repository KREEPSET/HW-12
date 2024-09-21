public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача 1");
        int year = 2021;
        printYear(year);
        System.out.println();
        System.out.println("    Задача 2");
        int clientOS2 = 0;
        int clientDeviceYear = 2015;
        printProgrammVersion(clientOS2, clientDeviceYear);
        System.out.println();
        System.out.println("    Задача 3");

        int deliveryDistance = 95;
        int days = calculateDays(deliveryDistance);
        ;

        if (days == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.printf("Потребуется %d дней доставки %n", days);
        }
    }

    public static int calculateDays(int deliveryDistance) {
        if (0 < deliveryDistance && deliveryDistance < 20) {
            return 1;
        } else if (20 <= deliveryDistance && deliveryDistance < 60) {
            return 2;
        } else if (60 <= deliveryDistance && deliveryDistance < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void printProgrammVersion(int clientOS, int clientDeviceYear) {
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
        }
    }

    public static void printYear(int year) {
        if (!(year > 1584)) {
            System.out.println("Год должен быть больше 1584");
            return;
        }
        boolean isLeapYear = checkYearForLeap(year);
        if (isLeapYear) {
            System.out.printf("%d год - високосный год. %n", year);
            return;
        }
        System.out.printf("%d год - невисокосный год. %n", year);
    }

    public static boolean checkYearForLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }


}























