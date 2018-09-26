package model;

import java.io.IOException;

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
		Node<T> node = new Node<T>(object);
		
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
		return length==0;
	}

	@Override
	public int length() {
		return this.length;
	}
	
	//Stack

	@Override
	public void push(T object) {
		Node<T> node = new Node<T>(object);
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
	public Node<T> top() {
		Node<T> temp;
		
		if (isEmpty()) {
			temp = null;
		} else {
			temp = end;
		}
		return temp;
	}

	//QUEUE
	
	@Override
	public void enqueue(T object) {
		Node<T> newNode = new Node<T>(object);

		if (this.isEmpty()) {
			this.head = newNode;
			this.end = newNode;
			length = 1;
		} else {
			this.end.setNextItem(newNode);
			this.end = newNode;
			this.length++;
		}
	}

	@Override
	public Node<T> front() {
		return head;
	}

	@Override
	public Node<T> dequeue() {
		Node<T> first = null;
		first = head;
		if (first != null) {
			head = head.getNextItem();
			length--;
		}
		return first;
	}
}
