package day15_innerClas;

 public class StudentRecord{
	 public static void main(String args[]) {


		 StudentRecordtest s=new StudentRecordtest();
		 StudentRecordtest.data a =s.new data();
		 a.input();
		 a.display();
		 s.show();
		 
	 }
	 
 }
 class StudentRecordtest {
	
	class data{




		String name;
		void display() {



			System.out.println("name: "+name +"date:"+date+" month :" +month +"year: " +year);
		}
		void input() {




			date = 3;
			month ="23/4/2018";
			year =2013;
			name ="rashmi";
		}

		
	}
	int date;
	String month;
	int year;
	void show()




	{
		System.out.println(" the student record is outer class");
	}
	

}
