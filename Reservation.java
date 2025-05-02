public class Reservation{
	public String getReservationDetails(String hotelName, String guestName, int nights)
	{
		return "Hotel Name : " +hotelName+ "\nGuest Name : " +guestName+ "\nNights : " +nights;
	}
	public static void main(String [] args)
	{
		Reservation reservation = new Reservation();
		String details=reservation.getReservationDetails("Grand Palace", "David", 3);
		System.out.println(details);
		System.out.println("------------------");
		String details1=reservation.getReservationDetails("Grand Palace", "Maria", 2);
		System.out.println(details1);
		System.out.println("------------------");
	}
}