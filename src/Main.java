public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int clientOS = 1;
        int clientDeviceYear  = 2014;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            }


        else if (clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
    }
    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int year = 2024;
        if (year %100 == 0 && year %400 == 0) {
            System.out.println("Год является высокосным");
        }
        else if (year % 4 == 0 && year %100 > 0) {
            System.out.println("Год является высокосным");
            }
        else if (year % 100 == 0) {
            System.out.println("Год является не высокосным");
            }
        else {
            System.out.println("Год является не высокосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 0) {
            System.out.println("Введите корректное значение расстояния");
        }
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Срок доставки составит 1 день");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Срок доставки составит 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Срок доставки составит 3 дня");
        }
        if (deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
        }




    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5

    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6

    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7

    }
}
