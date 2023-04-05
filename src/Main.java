public class Main {
    public static void main(String[] args) {
        int account = 250; //рублей изначально на счету
        int refill = 1300; //сумма пополнения

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        int amount = account + refill + bonus; //итоговая сумма на счету

        System.out.println("Бонусных рублей:" + (bonus));
        System.out.println("Итоговая сумма:" + (amount));
    }
}