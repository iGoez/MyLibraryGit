package TDA;

import model.Node;

public interface IQueue<T>{

	public void enqueue(T object);
	public Node<T> front();
	public Node<T> dequeue();
	public boolean isEmpty();
	public int length();
}
