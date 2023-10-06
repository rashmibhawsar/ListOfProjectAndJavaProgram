package _7_Queue;

public class ArrayCircularQ {
	int arr[];
	 int size;
	 int rear ;
	 int front;
	 public ArrayCircularQ(int n) {
			size= n;
			arr=new int[n];
			rear=-1;
			front=-1;
	}
	 public boolean isEmpty()
	{
			if(front==-1 && rear==-1)
				return true;
			else
				return false;
			
	}
	 public boolean isfull()
	{
			if((rear+1)%size ==front) // front== rear
				return true;
			else
				return false;
			
	}
	 void enqueue(int value)
	 {
		 if(isfull())
		 {
			System.out.println("queue is full"); 
		 }
		 else
		 {
			 if(front==-1)
				 front=0;
			 
			rear= (rear+1)%size;
			arr[rear]=value;
			 
					 
		 }
	 }
	 
	 void dequeue()
	 {
		 if(isEmpty())
			 System.out.println("no elements in queue to delete");
		 else
		 {
			 int data= arr[front]; //just for for display
			 arr[front]=0;
			 
			 if(front==rear) // when u have only 1 element
				 front=rear=-1;
			 front = (front+1)%size;// move front to one position ahead
			 
			 System.out.println("element deleted : " +data);
		 }
		
	 }
	 
	 void peek()
	 {
		 if(isEmpty())
			 System.out.println("no elements in queue to display");
		 else
		 {
			 System.out.println("peek: " +arr[front]);
		 }
	 }
	 
	 void display()
	 {
		 if(isEmpty())
			 System.out.println("no elements in queue to display");
		 else
		 {
			 //int j=front;
			 for(int i=front;i!=rear;i=((i+1)%size))
				 System.out.println(arr[i] +" ");
		 } 
	 }
	 
	 public static void main(String args[])
	 {
		 ArrayCircularQ cq = new ArrayCircularQ(5);
		 cq.enqueue(1);
		 cq.enqueue(2);
		 cq.enqueue(3);
		 cq.enqueue(4);
		 cq.enqueue(5);
		 cq.enqueue(6);
		 cq.display();
		 cq.peek();
		 cq.dequeue();
		 cq.display();
		 cq.peek();
		 cq.dequeue();
		 cq.display();
		 cq.enqueue(1);
		 cq.enqueue(2);
		 cq.display();
	
	 }

}
