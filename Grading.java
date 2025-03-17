package ClassWork;

public class Grading { //methods using branches 

	public static void main(String[] args) {
		int grade = 90;
		TestGrade(grade);
		//integer value = TestGrade(grade); return value of the method
		//System.out.println(TestGrade(grade)); 
		//System.out.print(value);
	}
	public static void TestGrade(int grade) {
		if (grade <= 90) {
			System.out.println("fail");
		} else  System.out.println("pass");
		}
	// grade = grade + 10;
	//System.out.println(grade);
	// return grade;
	}

