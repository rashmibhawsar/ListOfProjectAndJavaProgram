package day15_innerClas;

import day15_innerClas.SubjectDetails.math;

class SubjectDetails{
	
	static class extraclass{


		int b=12;
		
		void display()
		{
			subjectCode = 1233;
			System.out.println("subject code :" +subjectCode+ "value of b: " +b);
		}
		
		}
	class math{



		String name;
		math(){

			name ="rashmi";
			subject ="cs";
			
		}
		void display()

		{
			System.out.println("name: "+name+"subject: " +subject);
		}
		}
	static int subjectCode;
	String subject;
	}


public class SubjectDetailsTest {

	public static void main(String[] args) {



	SubjectDetails.extraclass e = new SubjectDetails.extraclass();
	e.display();
	SubjectDetails.math m = new SubjectDetails().new math();
	
	m.display();
	

	}

}
