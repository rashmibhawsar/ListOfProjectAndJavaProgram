package _7day;

public class buble_sort {

	public static void main(String[] args) {
		
		
		 int k[]= {123,2345,543,3456,45,67,89};
		 int temp ;
		
		 for(int m=0;m<k.length-1;m++) {
			 for(int i=0;i<k.length-1-m;i++) {
				 if(k[i]>k[i+1]) {
					 temp=k[i];
					 k[i]=k[i+1];
					 k[i+1]=temp;
					 
				 }
			 }

		 }
		 for(int j=0;j<k.length;j++)
		 {
			 System.out.print(" "+ k[j]);
		 }
		// TODO Auto-generated method stub

	}

}
