public class Book{
	public String displayInfo(String libraryName, String title, String author)
	{
		return "Library Name : " +libraryName+ "\nBook title : " +title+ "\nAuthor : " +author;
	}
	public static void main(String [] args)
	{
		Book book=new Book();
		String details=book.displayInfo("City Public Library", "The Great Gatsby", "F. Scott Fitzgerlad");
		System.out.println(details);
		System.out.println("--------------------");
		String details2=book.displayInfo("City Public Library", "1984", "George Orwell");
		System.out.println(details2);
		System.out.println("--------------------");
	}
}
		