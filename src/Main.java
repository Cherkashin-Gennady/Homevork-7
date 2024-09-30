public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1");

        int requiredSum = 2_459_000;
        int total = 0;
        int amount = 15_000;
        int month = 0;

        while (total <= requiredSum) {
            total += total / 100;
            total += amount;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        // Task 2
        System.out.println("Задача 2");

        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (; num >= 1; num--) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Task 3
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRate = 17;  //рождаемость
        int mortalityRate = 8; //смертность
        int currentYear = 2024;
        for (int year = currentYear + 1; year < currentYear + 11; year++) {
            population += population * birthRate / 1000 - population * mortalityRate / 1000;
            System.out.println("Год " + year + ", численность населения составит " + population + " чел.");
        }
        // Task 4
        System.out.println("Задача 4");

        double proc = 0.07;
        int x = 15_000; //первоначВкл
        int cumulative = 12_000_000; //цель
        month = 0;
        total = x;

        while (total < cumulative) {
            total = (int) (total * (1 + proc));
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
        // Task 5
        System.out.println("Задача 5");

        month = 0;
        total = x;

        while (total < cumulative) {
            total = (int) (total * (1 + proc));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
        // Task 6
        System.out.println("Задача 6");

        month = 0;
        total = x;
        int t = 12 * 9;

        while (month < t) {
            total = (int) (total * (1 + proc));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
        // Task 7
        System.out.println("Задача 7");

        int firstFriday = 2; //число первой пятницы месяца

        for (int dey = firstFriday; dey <= 31; dey += 7) {
            System.out.println("Сегодня пятница, " + dey + "-е число. Необходимо подготовить отчет");
        }
        // Task 8
        System.out.println("Задача 8");

        int period = 79;//период появления кометы
        int observat = 0;// первый год наблюдения кометы, начало отсчета итераций
        int currentYar = 2024;// текущий год, относительное условие для расчета в периоде наблюдения
        int last200 = currentYar - 200;//наблюдение до начала текущего года
        int next100 = currentYar + 100;// возможное наблюдение в будущем

        for (int yar = observat; yar < next100; yar += period) {
            if (yar > last200) {
                System.out.println(yar);
            }
        }
    }
}