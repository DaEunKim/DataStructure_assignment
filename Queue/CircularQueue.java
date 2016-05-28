package Queue;

public class CircularQueue {
	static String[] arr;
	static int front;
	static int rear;
	

	public static void create(int size){
		arr = new String [size];
		front=0;
		rear=0;
	}
	
	public static void refresh(){
		int temp = front;
		for(int i=0;i<size();i++){
			arr[i]=arr[temp++];	
		}
		rear -= front;
		front = 0;
		
	}
	
	public static int size(){
		return rear-front;
	}

	public static void enQueue(String element){
		arr[rear++]=element;
		for(int i=0;i<size();i++){
			
			System.out.print(arr[front+i]+" ");
			
		}
		
		System.out.println("");
		
		
	}
	
	public static String deQueue(){
		if(size()==0)
			return "";
		String temp = arr[front++];
		System.out.println("Dequeue : " + temp);
		refresh();
		
		for(int i=0; i<size(); i++){
			System.out.print(arr[i]+" ");			
		}
		System.out.println("");
		return temp;
	}



	public static void main(String[] args) {
		
		
	}

}
