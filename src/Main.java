public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int sum = 1900;
        int bonus = sum / 100;

        System.out.println("Баланс" + balance);

        System.out.println("Сумма пополнения" + sum);

        System.out.println("Бонусы");
        if (sum > 1000) {
            System.out.println(bonus);
        } else {
            System.out.println("0");
        }

        System.out.println("Итоговый баланс");
        if (sum >= 1000) {
            System.out.println(sum + bonus + balance);
        } else {
            System.out.println(sum + balance);
        }
    }
}