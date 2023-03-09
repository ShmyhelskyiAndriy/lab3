public class Lab_3 {
    public static void main(String[] args) {

        // 1
        System.out.println("task 1");
        int n;
        n = 98;
        if (n > 50 && n < 100) {
            System.out.println("Число " + n + " міститься в проміжку (25; 100)»");
        } else {
            System.out.println("Число " + n + "не міститься в проміжку (25; 100)");
        }

        // 2
        System.out.println("task 2");
        int a;
        int b;
        int c;
        n = 678;
        a = n / 100;
        b = (n % 100) / 10;
        c = n % 10;
        if (a > b && a > c) {
            System.out.println("Перше число найбільше");
        } else if (b > a && b > c) {
            System.out.println("Друге число найбільше");
        } else {
            System.out.println("Третє число найбільше");
        }

        // 3
        System.out.println("task 3");
        String direction = "До низу";
        int floor = 5;
        if (floor == 2 && direction == "Вверх") {
            floor = 3;
        } else if (floor == 2 && direction == "До низу") {
            floor = 1;
        }
        if (direction == "До низу") {
            System.out.println("Ви спустились на " + floor + " поверх");
        } else {
            System.out.println("Ви піднялись на " + floor + " поверх");
        }

        // 4
        System.out.println("task 4");

        String quest=("так");

        switch (quest) {
            case "так":
            case "ок":
            case "yes":
            case "y":
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "ні":
            case "no":
            case "n":
            case "-":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Неправильний ввід. Будь ласка, введіть Так або Ні.");
                break;
        }

    }
}