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

    public static void task1 () {
        System.out.println("Задача 1");
        short age = 15;
        if (age >= 18) {
            System.out.println("18 и более лет");
        } else {
            System.out.println("Несовершеннолетний");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        short temp = -3;
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапк");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short speed = 40;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        short age = 16;
        if (age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else {
            if (age > 6 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить  в школу");
            } else {
                if (age > 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                } else {
                    System.out.println("пора на работу");
                }
            }
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short age = 6;
        if (age <= 5) {
            System.out.println("Если возраст ребенка  равен " + age + ", то он не может кататься на аттракционe");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка  равен " + age + ", он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("старше 14 лет, может кататься без сопровождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        short carriageOccupancy = 104;
        short carriageCapacity = 102;
        short carriageSitting = 60;
        if (carriageOccupancy < carriageSitting) {
            System.out.println("есть сидячие места");
        } else {
            if (carriageOccupancy < carriageCapacity) {
                System.out.println("есть стоячие места");
            } else {
                System.out.println("в вагoне нет мест");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 14;
        int two = 16;
        int three = 24;
        if (one > two && one > three) {
            System.out.println (one);
        } else
            if (two > one && two > three) {
                System.out.println(two);
            }
            else System.out.println(three);
        }

