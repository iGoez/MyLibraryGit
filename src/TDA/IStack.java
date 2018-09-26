package TDA;

import model.Node;

public interface IStack<T>{

	public void push(T object);
	public Node<T> pop();
	public boolean isEmpty();
	public int length();
	public Node<T> top();
}
