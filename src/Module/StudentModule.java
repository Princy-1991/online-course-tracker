package Module;

public class StudentModule {

	private int Studentid;
	public String studentname;
	public String email;
	public double Mobilenumber;
	
	public int getStudentid() {
		return Studentid;
	}

	public static void main(String[] args) {
		StudentModule obj = new StudentModule();
		System.out.println(obj.Studentid);
		System.out.println(obj.studentname);
		System.out.println(obj.email);
		System.out.println(obj.Mobilenumber);
	}

}
