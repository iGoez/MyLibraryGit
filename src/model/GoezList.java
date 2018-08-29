package model;

import TDA.IList;
import TDA.IQueue;
import TDA.IStack;

public class GoezList <T> implements IList<T>, IQueue<T>, IStack<T>{
	
	private Node<T> head;
	private Node<T> end;
	private int length;
	
	public GoezList(){
		head = null;
		end = null;
		length = 0;
	}
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getEnd() {
		return end;
	}

	public void setEnd(Node<T> end) {
		this.end = end;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void add(T object) {
		Node<T> node = new Node<T>(object, length);
		
		if(head==null) {
			head = node;
			end = node;
			length++;
		}else {
			end.setNextItem(node);
			node.setPrevious(end);
			end = node;
			length++;
		}
	}

	@Override
	public void removeLast() {
		end.getPrevious().setNextItem(null);
		end = end.getPrevious();
		length--;
	}

	@Override
	public void removeFirst() {
	}
	
	@Override
	public void remove(int index) {
		
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int length() {
		return this.length;
	}

	@Override
	public void push(T object) {
		Node<T> node = new Node<T>(object, length);
		if(end==null) {
			head = node;
			end = node;
			length++;
		}else {
			node.setPrevious(end);
			end = node;
			length++;
		}
	}

	@Override
	public Node<T> pop() {
		
		Node<T> aux = end;
		end = end.getPrevious();
		length--;
		
		return aux;
	}

	@Override
	public void enqueue(T object) {
	}

	@Override
	public Node front() {
		return null;
	}

	@Override
	public void dequeue() {
	}

}
