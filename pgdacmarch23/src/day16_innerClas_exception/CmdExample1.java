package day16_innerClas_exception;


	public class CmdExample1  {
		public static void main(String[] args) {



			String first_name = args[0];
			String last_name = args[1];
			double weight = Double.parseDouble(args[2]);
			
			double height = Double.parseDouble(args[3]);
			
			//System.out.println(args[0] +"  "+ args[1]+"  "+ args[2]);
			
			Double BmI =weight/Math.sqrt(height);
			System.out.println(BmI);

			

		}
		String first_name;
		int height;
		String last_name;
		

		int weight;

}


