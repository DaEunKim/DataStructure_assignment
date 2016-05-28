package Stack;

import java.util.EmptyStackException;

public interface IStack<E> {
	public int capacity();
	
	public int size();
	
	public boolean isEmpty();
	
	public E top() throws EmptyStackException;
	
	public void push(E element);
	
	public E pop() throws EmptyStackException;

}
