package hashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
class Student1 {

	private int studentId;
	private String studentName;
	private int courseId;

	public Student1(int studentId, String studentName, int courseId) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public boolean equals(Object student) {
		Student1 otherStudent = (Student1) student;
		if (this.studentId == otherStudent.studentId)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Student Id: "+studentId + ", Student Name: " + studentName;
	}

}

public class Exercise_1 {
	public static Set<Student1> findDuplicateEntries(List<Student1> students) {
		//Implement your logic here and change the return statement accordingly
		
		
		Set<Student1> st=new HashSet<Student1>();
		Set<Student1> duplicate=new HashSet<Student1>();
		for(Student1 t :students) {
			if(!st.add(t)) {
				duplicate.add(t);
				
			}
		}
		return duplicate;
	}
	
	public static void main(String[] args) {
		List<Student1> students = new ArrayList<Student1>();

		students.add(new Student1(1001, "Dean", 111));
		students.add(new Student1(1002, "Harley", 112));
		students.add(new Student1(1003, "Franklin", 113));
		students.add(new Student1(1005, "Arden", 113));
		students.add(new Student1(1100, "Juliet", 112));
		students.add(new Student1(1003, "Franklin", 111));
		students.add(new Student1(1001, "Dean", 114));

		Set<Student1> duplicateStudents = findDuplicateEntries(students);
		System.out.println("Students who have applied for re-evaluation in more than one subject");
		for(Student1 student: duplicateStudents)
		    System.out.println(student);
	}

}
