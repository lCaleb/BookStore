package MCLibrary;



public class MCStack<T> implements IStack<T> {

	private MQueue<T> cola;
	private MQueue<T> cola2;
	private int size;

	public MCStack() {

		cola = new MList<T>();
		cola2 = new MList<T>();
	}

	@Override
	public void push(T element) {

		if (cola.isEmpty()) {
			cola.offer(element);
		} else {
			cola2.offer(element);

			while (!cola.isEmpty()) {
				cola2.offer(cola.poll());
			}

			MQueue<T> temporal = cola;
			cola = cola2;
			cola2 = temporal;

		}
		size+=1;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public T pop() {

		T element = (T) cola.poll();

		return element;
	}

	@Override
	public T top() {
		T element = (T) cola.peek();

		return element;
	}

	@Override
	public boolean isEmpty() {
		

		return cola.isEmpty();
	}

}
