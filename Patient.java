public class Patient{
	public String printDetails(String hospitalName, String patientName, int age)
	{
		return "Hospital Name : " +hospitalName+ "\nPatient name : " + patientName+ "\nAge : " +age;
	}
	public static void main(String [] args)
	{
		Patient patient = new Patient();
		String details=patient.printDetails("City Care Hospital", "John Doe", 45);
		System.out.println(details);
		System.out.println("-------------------");
		String details1=patient.printDetails("City Care Hospital", "Emma Watson", 30);
		System.out.println(details1);
		System.out.println("-------------------");		
	}
}