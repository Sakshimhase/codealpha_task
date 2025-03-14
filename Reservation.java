package Hotel_reservation;

public class Reservation {
	private String guestName;
    private Room room;
    private boolean isPaid;

    public Reservation(String guestName, Room room) {
        this.guestName = guestName;
        this.room = room;
        this.isPaid = false;
    }

    public void makePayment() {
        isPaid = true;
        System.out.println("Payment successful for Room " + room.getRoomNumber());
    }

    public void displayBookingDetails() {
        System.out.println("\nBooking Details:");
        System.out.println("Guest: " + guestName);
        System.out.println("Room: " + room.getRoomNumber() + " (" + room.getCategory() + ")");
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Payment Status: " + (isPaid ? "Paid" : "Pending"));
    }
}
