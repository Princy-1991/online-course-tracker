package Module;

public class CourseModule {
	private int courseid;
	public String coursename;
	public String totalLessons;
	public int courseduration;
	public String trainername;

	public static void main(String[] args) {
		CourseModule obj = new CourseModule();
		System.out.println(obj.courseid);
		System.out.println(obj.coursename);
		System.out.println(obj.totalLessons);
		System.out.println(obj.courseduration);
		System.out.println(obj.trainername);
	}

}
