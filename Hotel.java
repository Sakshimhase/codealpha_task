package Hotel_reservation;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private List<Room> rooms = new ArrayList<>();

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public void displayAvailableRooms() {
		System.out.println("\nAvailable Rooms:");
		for (Room room : rooms) {
			if (room.isAvailable()) {
				System.out.println(room);
			}
		}
	}

	public Room bookRoom(int roomNumber) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
				room.bookRoom();
				return room;
			}
		}
		return null;
	}

	public void cancelBooking(int roomNumber) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == roomNumber && !room.isAvailable()) {
				room.freeRoom();
				System.out.println("Booking cancelled for Room " + roomNumber);
				return;
			}
		}
		System.out.println("Room not found or already available!");
	}
}
