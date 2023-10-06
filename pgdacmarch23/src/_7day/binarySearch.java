package _7day;

public class binarySearch {

	public static void main(String[] args) {
		int y[]= {1,22,33,44,55,66,77,88};
		int s=0;
		int f= 0;
		int l= y.length-1;
		while(f<=l)
		{
			int mid = (f+l)/2;
			if(y[mid]==s) {
				System.out.println("element found");
				break;
			}
			else if(y[mid]<s) {
				f=mid+1;
			}
			else l=mid-1;
				
		}if(f>l) {
			System.out.println("element not found");
		}
		// TODO Auto-generated method stub

	}

}
