public class Main {
    public static void main(String[] args) {
        double TicketPrice = 15928.99;
        int RoublesPerMile = 20;
        int MileageBonus = (int)(TicketPrice / RoublesPerMile);
        System.out.println(MileageBonus);
    }
}