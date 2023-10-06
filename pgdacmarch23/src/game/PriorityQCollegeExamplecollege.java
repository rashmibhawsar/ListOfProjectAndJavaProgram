package game;


import java.util.*;
class Collegee 
{
	String collegename;
	String branch;
	float fees;
	Collegee(String a,String b,float c){

		collegename=a;
		branch=b;
		fees=c;
		}	
	
	public String toString()


	{
		return collegename+ " "+ branch +"  "+ fees;
	}
}
class Alpha implements Comparator<Collegee>{
	public int compare(Collegee i,Collegee j) {

		return i.collegename.compareTo(j.collegename);
		}
}

public class PriorityQCollegeExamplecollege {
	String coll_name=null;
	String branch  = null;
	int fee= 0;
	
	void getdata() {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter college name...");
		coll_name= sc.next();
		System.out.println("enter branch ...");
		branch = sc.next();
		System.out.println("enter fees...");
		fee = sc.nextInt();
	}

	public static void main(String[] args) {


		

		PriorityQCollegeExamplecollege p1 = new PriorityQCollegeExamplecollege();
		p1.getdata();
		PriorityQCollegeExamplecollege p2 = new PriorityQCollegeExamplecollege();
		p2.getdata();
		PriorityQCollegeExamplecollege p3 = new PriorityQCollegeExamplecollege();
		p3.getdata();
		PriorityQCollegeExamplecollege p4 = new PriorityQCollegeExamplecollege();
		p4.getdata();
		PriorityQCollegeExamplecollege p5 = new PriorityQCollegeExamplecollege();
		p5.getdata();
		
		
		
		Collegee e1= new Collegee(p1.coll_name,p1.branch,p1.fee);
		Collegee e2= new Collegee(p2.coll_name,p2.branch,p2.fee);
		Collegee e3= new Collegee(p3.coll_name,p3.branch,p3.fee);
		Collegee e4= new Collegee(p4.coll_name,p4.branch,p4.fee);
		Collegee e5= new Collegee(p5.coll_name,p5.branch,p5.fee);
		
		//PriorityQueue<Collegee> s= new PriorityQueue<Collegee>( );
		PriorityQueue<Collegee> s= new PriorityQueue<Collegee>(new Alpha());
		PriorityQueue<Collegee> r= new PriorityQueue<Collegee>(new Alpha());
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		r.addAll(s);

		
//		System.out.println(s.remove(e));
	
		Iterator<Collegee> i= r.iterator();
		while(i.hasNext())
		
		{
			System.out.println(i.next());
		}
		
		/*System.out.println("data removed is...");
		System.out.println(s.remove());*/

	}

}

