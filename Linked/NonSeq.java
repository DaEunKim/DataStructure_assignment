package Linked;

public class NonSeq {
	static String[] arr;
	
	public void non(){
		
		
	}
	public int array(){
		return 0;
		
	}
	public static NonSeq Create(int n){
		arr = new String[n];
		return arr;
	}
	
	public String add(String data){
		return null;
		
	}
	public String insert(String data){
		return null;
		
	}
	public String delete(String data){
		return null;
	}

	public static void main(String[] args) {
		
		
		System.out.println(":::::::::::: NonSequential Array :::::::::::: ");
		
	//	NonSeq arr = new NonSeq();
		
		NonSeq array = NonSeq.Create(100);
		
		System.out.println("1. Add \"BAT\"");
		
		array.add("BAT");
		for (NonSeq data : array) {
			System.out.print(data + " "); 
		}
		System.out.println();
		System.out.println("2. Add \"CAT\"");
		array.add("CAT");
		for (String data : array) {
		System.out.print(data + " "); }
		
		
		System.out.println("1. Insert \"GAT\"");
		array.insert("GAT");
		for (String data : array) {
		System.out.print(data + " "); }
		System.out.println("\n\n");
		System.out.println("1. Delete \"DAT\"");
		array.delete("DAT");
		for (String data : array) {
		System.out.print(data + " "); }
		System.out.println("2. Delete \"PAT\"");
		array.delete("PAT");
		for (String data : array) {
		System.out.print(data + " "); }

	}

}
