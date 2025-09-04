
public class Main {
    public static void main(String[] args) {

        double visota = 100.0;
        double g = 9.8;
        double time = Math.sqrt(2 * visota / g);

        System.out.println("1. Время падения тела с высоты " +visota + " метров: " + time + " секунд");
        double ball = 4.5;
        System.out.println("2. Мой средний балл за сессию: " + ball);

        int a = 5;
        int b = 5;

        System.out.println("3. Разница между префиксной и постфиксной формами:");
        System.out.println("Начальные значения: a = " + a + ", b = " + b);

        int result1 = ++a;
        System.out.println("После ++a: result1 = " + result1 + ", a = " + a);

        int result2 = b++;
        System.out.println("После b++: result2 = " + result2 + ", b = " + b);
    }

}

