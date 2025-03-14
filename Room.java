package Hotel_reservation;

public class Room {
	private int roomNumber;
	private String category;
	private double price;
	private boolean isAvailable;

	public Room(int roomNumber, String category, double price) {
		this.roomNumber = roomNumber;
		this.category = category;
		this.price = price;
		this.isAvailable = true; // Default: available
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void bookRoom() {
		isAvailable = false;
	}

	public void freeRoom() {
		isAvailable = true;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + " [" + category + "] - $" + price + " - "
				+ (isAvailable ? "Available" : "Booked");
	}
}
