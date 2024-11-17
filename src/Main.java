public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високостным.");
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");
        int cash = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = cash + total;
            {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
            }
        }
        System.out.println("Задача 9");
        int cashB = 29000;
        int totalB = 0;
        for (int i = 0; i <= 12; i++) {
            totalB = totalB + totalB / 100;
            totalB = totalB + cashB;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalB + "рублей");
        }

        System.out.println("Задача 10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}















