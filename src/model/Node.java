package model;

public class Node<T>{

	private T type;
	private Node<T> nextItem;
	private Node<T> previous;
	
	public Node(T type) {
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	public Node<T> getNextItem() {
		return nextItem;
	}

	public void setNextItem(Node<T> nextItem) {
		this.nextItem = nextItem;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
}
