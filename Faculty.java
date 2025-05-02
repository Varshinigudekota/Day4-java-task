public class Faculty{
	public String showFacultyDetails(String universityName, String facultyName, String department)
	{
		return "University name : " +universityName+ "\nFaculty name : " +facultyName+ "\nDepartment : " +department;
	}
	public static void main(String [] args)
	{
		Faculty faculty = new Faculty();
		String details=faculty.showFacultyDetails("Stanford University", "Dr. Robert Brown", "Computer Science");
		System.out.println(details);
		System.out.println("------------------");
		String details1 = faculty.showFacultyDetails("Stanford University", "Dr. Lisa Green", "Physics");
		System.out.println(details1);
		System.out.println("-----------------");
	}
}
	