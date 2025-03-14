package Hotel_reservation;

import java.util.Scanner;

public class HotelReservationSystem {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        // Adding rooms
        hotel.addRoom(new Room(101, "Single", 100));
        hotel.addRoom(new Room(102, "Double", 150));
        hotel.addRoom(new Room(103, "Suite", 250));

        boolean running = true;
        while (running) {
            System.out.println("\n1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter Room Number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Guest Name: ");
                    String guestName = scanner.nextLine();

                    Room bookedRoom = hotel.bookRoom(roomNumber);
                    if (bookedRoom != null) {
                        Reservation reservation = new Reservation(guestName, bookedRoom);
                        reservation.displayBookingDetails();
                        System.out.print("Proceed with payment? (yes/no): ");
                        String pay = scanner.nextLine();
                        if (pay.equalsIgnoreCase("yes")) {
                            reservation.makePayment();
                        }
                    } else {
                        System.out.println("Room not available!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Room Number to cancel: ");
                    int cancelRoom = scanner.nextInt();
                    hotel.cancelBooking(cancelRoom);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
        scanner.close();
    }
}

