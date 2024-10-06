public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке..");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке..");
        } else {
            System.out.println("Неизвестная OS.");
        }

        int clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке..");
        } else if (clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке..");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке..");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке..");
        }


        int year = 1583;
        int leapYearRemains = (year - 1584) % 4;
        int leapYearRemains100 = (year - 1584) % 100;
        int leapYearRemains400 = (year - 1584) % 400;
        if (year == 1584 || (leapYearRemains == 0 && (leapYearRemains100 != 0 || leapYearRemains400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        byte deliveryDistance = 15;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: одни сутки.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: двое суток.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: трое суток.");
        } else {
            System.out.println("Доставки нет.");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}