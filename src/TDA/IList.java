package TDA;

public interface IList<T>{

	public void add(T object);
	public void removeLast();
	public void removeFirst();
	public void remove(int index);
	public boolean isEmpty();
	public int length();
}
