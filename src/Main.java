//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");


        int clientDeviceYear = 2020;
        int clientO = 0;
        if (clientDeviceYear < 2015 && clientO == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientO == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientO == 1) {
            System.out.println("Установите  приложение для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientO == 0) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Введите корректные данные");
        }


        System.out.println("Задание 3");
            int year = 2021;
            if (year < 1584){
            System.out.println("Год должен быть больше 1584");
        }
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " Это високосный год");
        } else{
            System.out.println(year + "  Это не високосный год");
        }


        System.out.println("Задание 4");

        int deliveryDistance = 110;
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + time);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + (time + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + (time + 1 + 1));
        } else {
            System.out.println("Доставки нет");
        }
         System.out.println("Задание 5");
            int monthNumber = 12;
            switch (monthNumber){
            case 1:
            case 2:
            case 12:
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
                System.out.println("Введите корректное значение");
        }
    }
}













