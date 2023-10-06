package day14_abst_Claand_Interf;
class emp1{
	void addData()
	{
		class NewEmployee implements person
		{
			public void adharregister()
			{
				System.out.println("my aadhar registeRATION is done");
			}
		} NewEmployee n = new NewEmployee();
		n.adharregister();
	}
}
public class LocalClassExampleWithInterface {

	public static void main(String[] args) {
		emp1 e = new emp1();
		e.addData();
	

	}

}

interface person{
	void adharregister();
}
