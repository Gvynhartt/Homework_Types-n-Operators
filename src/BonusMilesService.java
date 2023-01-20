public class BonusMilesService {
    public int calculate(int cost) {
        // double ticketPrice = 15928.99; // стоимость билета - дробная, потому что реализм
        int roublesPerMile = 20; // сколько рублей нужно на каждую бонусную милю
        int mileageBonus = (cost / roublesPerMile); // подсчитывает итоговое число бонусных миль
        return mileageBonus;
    }
}
