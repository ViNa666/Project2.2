public class Main {
    public static void main(String[] args) {

        int account = 100; //сумма на счету
        int payment = 1100; //сумма пополнения счета
        int bonus; //сумма бонусов
        if (payment > 1000) {
            bonus = payment/100;
        } else {
            bonus = 0;
        }
        account = account + payment + bonus;

        System.out.println("Вам начислено " + bonus + " бонусных рублей");
        System.out.println("У вас на счету  " + account + " рублей");

    }

}
