public class Enrollment{
	public String getEnrollmentInfo(String platform, String course, String student)
	{
		return "Platform : " +platform+ "\nCourse : "+course+ "\nStudent : " +student;
	}
	public static void main(String [] args)
	{
		Enrollment enrollment = new Enrollment();
		String details=enrollment.getEnrollmentInfo("Udemy", "Java Programming", "Alice");
		System.out.println(details);
		System.out.println("-------------------");
		String details1=enrollment.getEnrollmentInfo("Udemy", "Web Development", "Bob");
		System.out.println(details1);
		System.out.println("-------------------");
	}
}