public class Main {
    public static void main(String[] args) {
        BonusMilesService mileageBonus = new BonusMilesService();
        double cost = 15928.99; // стоимость билета - дробная, потому что реализм
        int price = mileageBonus.calculate((int)cost); // подсчитывает итоговое число бонусных миль
        System.out.println("Ваше число бонусных миль: " + price);
    }
}
