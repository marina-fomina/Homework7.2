public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задание 1
        System.out.println("Задача №1");
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задание 2
        System.out.println("Задача №2");
        int maxSpending = 0;
        int minSpending = 201_000;
        for (int current : arr) {
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + maxSpending + " рублей.");
        for (int current : arr) {
            if (current < minSpending) {
                minSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей.");

        // Задание 3
        System.out.println("Задача №3");
        sum = 0;
        double averageSpending = 0;
        for (int element : arr) {
            sum += element;
        }
        averageSpending = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей.");

        // Задание 4
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int variant = reverseFullName.length - 1; variant >= 0; variant --) {
            if (variant != 0) {
            System.out.print(reverseFullName[variant]) ;
        } else {
                System.out.println(reverseFullName[variant]);
            }
    }
}}