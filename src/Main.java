public class Main {
    public static void main(String[] args) {
        double initialBalance = 300; // изначальная сумма на счету
        double topUpAmount = 928; // сумма пополнения счёта
        boolean isBonusApplicable = false; // логическая переменная, показывающая, доступен ли бонус

        if (topUpAmount > 1000) {
            isBonusApplicable = true;
        } else {
            isBonusApplicable = false;
        }

        int operatorBonus = isBonusApplicable ? (int) (topUpAmount / 100) : 0; // подсчитывается итоговый бонус от оператора
        System.out.println("Итоговый баланс на счету: " + (initialBalance + topUpAmount + operatorBonus) + " рублей; бонус от оператора: " + operatorBonus + " рублей.");
    }
}
