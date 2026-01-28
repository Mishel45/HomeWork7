//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Уважаемый наставник представляю Вашему вниманию домашнее задание " + "к уроку за 9 февраля 2026г. ");
        System.out.println();

        System.out.println("Задача №1 ");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задача №2 ");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("1становите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задача №3 ");
        int year = 2021;
        boolean leap = false;
        if (year > 1584 && year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                leap = false;
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год не високосный");
        }

        System.out.println();
        System.out.println("Задача №4 ");
        int deliveryDistance = 95;
        int delivery = 1;
        if (deliveryDistance < 20 && deliveryDistance >= 0) {
            System.out.println("Потребуется дней: " + delivery);
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            delivery = delivery + 1;
            System.out.println("Потребуется дней: " + delivery);
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            delivery = delivery + 2;
            System.out.println("Потребуется дней: " + delivery);
        } else {
            System.out.println("На такое расстояние доставки нет");
        }

        System.out.println();
        System.out.println("Задача №5 ");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}