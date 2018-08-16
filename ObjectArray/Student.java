package exercise06;

public class Student {
	private String name;
	private int grade;
	private char letterGrade;
	
	
	public Student() {
		
	}
	
	public Student(String name, int grade, char letterGrade) {
		this.name = name;
		this.grade = grade;
		this.letterGrade = letterGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public char getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", grade=" + getGrade() + ", letter grade=" + getLetterGrade() + "]";
	}
}
