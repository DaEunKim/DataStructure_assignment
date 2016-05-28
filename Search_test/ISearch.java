package Search_test;

public interface ISearch<E> {
	
	public static final int NOTFOUND =-1;
	
	int search(E[] elems, int key);

	
}
