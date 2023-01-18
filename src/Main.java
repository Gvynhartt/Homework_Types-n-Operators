public class Main {
    public static void main(String[] args) {
        double InitialBalance = 300; // изначальная сумма на счету
        double TopUpAmount = 928; // сумма пополнения счёта
        boolean IsBonusApplicable = false; // логическая переменная, показывающая, доступен ли бонус

        if (TopUpAmount > 1000) {
            IsBonusApplicable = true;
        } else {
            IsBonusApplicable = false;
        }

        int OperatorBonus = IsBonusApplicable ? (int) (TopUpAmount / 100) : 0; // подсчитывается итоговый бонус от оператора
        System.out.println("Итоговый баланс на счету: " + (InitialBalance + TopUpAmount + OperatorBonus) + " рублей; бонус от оператора: " + OperatorBonus + " рублей.");
    }
}