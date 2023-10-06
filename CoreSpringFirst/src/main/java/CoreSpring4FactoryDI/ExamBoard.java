package CoreSpring4FactoryDI;

public class ExamBoard {
	public static Exam getexam(){


		Exam e = new Exam();
		e.setDuration("5");
		e.setEnddate("1-6-2023");
		e.setStartdate("2-6-2023");
		e.setName("rashmi");
	
		return e;
	
	}

}
