// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
        int age = 15;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На уице " + temperature + " градусов, можно идти без шапки.");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Скорость " + speed + " км/ч, придется заплатить штраф.");
        } else {
            System.out.println("Скорость " + speed + " км/ч, можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 25;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " ,то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");

        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
        } else if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека " + age + " ,то ему нужно ходить на работу.");
        } else if (age > 60) {
            System.out.println("Если возраст человека " + age + " , то ему пора отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int childrehAge = 4;
        if (childrehAge < 5) {
            System.out.println("Если возраст ребенка равен " + childrehAge + " , то ему нельзя кататься на аттракционе");
        } else if (childrehAge >= 5 && childrehAge < 14) {
            System.out.println("Если возраст ребенка равен " + childrehAge + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (childrehAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childrehAge + " , то  ему можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacityWagon = 10;
        int allCapacity = 102;
        int seatPlace = 60;
        if (capacityWagon < allCapacity) {
            System.out.println("В вагоне есть места");

        } else {
            System.out.println("В вагоне мест нет");
            }
        if (capacityWagon <= allCapacity && capacityWagon <= seatPlace) {
            System.out.println("Вы поедете сидя");
        }
        if (capacityWagon <= allCapacity && capacityWagon >= seatPlace) {
            System.out.println("Вы поедете стоя");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 88;
        int three = 9;
        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else if (three >= one && three >= two) {
            System.out.println(three);
        }

        }
    }




















