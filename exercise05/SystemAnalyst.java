package exercise05;

public class SystemAnalyst extends Student implements JavaStudent, Coop, ThreeYearProgram {
	
	@Override
	public void attendClass() {
		System.out.println("Students in system analyst attend classes.");
	}
	
	@Override
	public void takeTests() {
		System.out.println("Students in system analyst take tests.");
	}
	
	@Override
	public void writeJavaCode() {
		System.out.println("Students in system analyst write java code.");
	}
	
	@Override
	public void takeQuiz() {
		System.out.println("Students in system analyst take quiz.");
	}
	
	@Override
	public void submitResume() {
		System.out.println("Students in system analyst submit resumes for coop.");
	}

	@Override
	public void haveJobInterview() {
		System.out.println("Students in system analyst have job interviews for coop.");
	}
	
	@Override
	public void paySixTimesTuitionFee() {
		System.out.println("Students in system analyst pay tuition fee for six times.");		
	}
	
	@Override
	public void lookForJobInSixthSemester() {
		System.out.println("Students in system analyst will look for job in sixth semester.");		
	}

}
