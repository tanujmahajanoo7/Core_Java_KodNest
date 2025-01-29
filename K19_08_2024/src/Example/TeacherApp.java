package Example;

public class TeacherApp {

	public static void main(String[] args) {
		
//		JavaTeacher ref1 = new JavaTeacher();
//		ref1.markAttendence();
//		ref1.teach();
//		
//		SqlTeacher ref2 = new SqlTeacher();
//		ref2.markAttendence();
//		ref2.teach();
		
		Classroom c = new Classroom();
		c.callTeacher(new JavaTeacher());
		c.callTeacher(new SqlTeacher());
		
	}

}
