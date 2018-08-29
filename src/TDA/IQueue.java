package TDA;

import model.Node;

public interface IQueue<T>{

	public void enqueue(T object);
	public Node front();
	public void dequeue();
}
