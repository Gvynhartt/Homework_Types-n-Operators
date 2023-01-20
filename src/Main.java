public class Main {
    public static void main(String[] args) {

        double ticketPrice = 15928.99; // стоимость билета - дробная, потому что реализм
        int roublesPerMile = 20; // сколько рублей нужно на каждую бонусную милю
        int mileageBonus = (int)(ticketPrice / roublesPerMile); // подсчитывает итоговое число бонусных миль
        System.out.println(mileageBonus);
    }
}
