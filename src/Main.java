public class Main {

    public static void main(String[] args) {

        // Задача 1
        double deposit = 0;
        int month = 1;
        while (deposit <= 2_459_000) {
            deposit += 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) deposit + " рублей");
            month++;
        }


        // Задача 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 3
        double population = 12000000;
        for (int year = 1; year <= 10; year++) {
            double birthRate = population / 1000 * 17;
            double deathRate = population / 1000 * 8;
            population = population + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + (long) population);
        }

        // Задача 4
        deposit = 15000;
        month = 1;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * 0.07;
            month++;
            System.out.println("В " + month + " месяц накопления составили " + (long) deposit + " рублей");
        }

        // Задача 5
        deposit = 15000;
        month = 1;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * 0.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяц накопления составили " + (long) deposit + " рублей");
            }
        }

        // Задача 6
        deposit = 15000;
        month = 1;
        while (month <= 9 * 12) {
            deposit = deposit + deposit * 0.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяц накопления составили " + (long) deposit + " рублей");
            }
        }

        // Задача 7
        int friday = 3; // Допустим, что первая пятница месяца - это 3 число
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        // Задача 8
        int yearNow = 2024;
        int yearBefore = yearNow - 200;
        int yearAfter = yearNow + 100;
        for (int year = yearBefore; year <= yearAfter; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}