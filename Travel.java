public class Travel{
	public String getBookingDetails(String agency, String destination, int travellers)
	{
		return "Agency : " +agency+ "\nDestination : " +destination+ "\nTravellers : " +travellers;
	}
	public static void main(String [] args)
	{
		Travel travel = new Travel();
		String three=travel.getBookingDetails("Wanderlust Travels", "Paris", 2);
		System.out.println(three);
		System.out.println("--------------------");
		String three1=travel.getBookingDetails("Wandarlust Travels", "Tokyo", 3);
		System.out.println(three1);
		System.out.println("--------------------");
	}
}