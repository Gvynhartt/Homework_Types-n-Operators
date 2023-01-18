public class Main {
    public static void main(String[] args) {
        double TicketPrice = 15928.99; // стоимость билета - дробная, потому что реализм
        int RoublesPerMile = 20; // сколько рублей нужно на каждую бонусную милю
        int MileageBonus = (int)(TicketPrice / RoublesPerMile); // подсчитывает итоговое число бонусных миль
        System.out.println(MileageBonus);
    }
}
