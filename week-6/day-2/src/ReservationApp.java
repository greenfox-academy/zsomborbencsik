public class ReservationApp {

    public static void main(String[] args) {
        Reservation newRes = new Reservation();
        newRes.getCodeBooking();

        for (int i = 0; i < 10; i++) {
            System.out.println("Booking# " + newRes.getCodeBooking() + " for " + newRes.getDowBooking());
        }
    }
}