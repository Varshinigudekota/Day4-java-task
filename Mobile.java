public class Mobile{
	public String showDetails(String storeName, String brand, int price)
	{
		return "Store Name: " +storeName+ "\nMobile Brand : " +brand+ "\nPrice : " +price;
	}
	public static void main(String [] args)
	{
		Mobile mobile = new Mobile();
		String details = mobile.showDetails("Tech World", "Apple", 1200);
		System.out.println(details);
		System.out.println("----------------");
		String details1 = mobile.showDetails("Tech World", "Samsung", 900);
		System.out.println(details1);
		System.out.println("---------------");
	}
}