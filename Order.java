public class Order{
	public String getOrderDetails(String restaurantName, String foodItem, String quantity)
	{
		return "Restaurant Name : " +restaurantName+ "\nFood Item : " +foodItem+ "\nQuantity : " +quantity;
	}
	public static void main(String [] args)
	{
		Order order = new Order();
		String details=order.getOrderDetails("Spice Garden", "Paneer Butter Masala", "2");
		System.out.println(details);
		System.out.println("-----------------");
		String details1=order.getOrderDetails("Spice Garden", "Chicken Biriyani", "1");
		System.out.println(details1);
		System.out.println("-----------------");
	}
}	