
public class PARTICE8 {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,1,1,2,0};
		//int start = arr[0];
		//int end = arr[7];
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			
			
		}
		}
		for(int i=1;i<8;i++)
		{System.out.print(arr[i]);
		}
		
		

	}

}
