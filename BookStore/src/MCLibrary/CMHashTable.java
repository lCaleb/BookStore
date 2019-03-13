package MCLibrary;

import java.util.Hashtable;
import java.util.LinkedList;

import model.Book;


@SuppressWarnings("unused")
public class CMHashTable<K, V> {

	@SuppressWarnings("hiding")
	public class Node<K, V> {
		public K key;
		public V value;

		public Node<K, V> siguiente;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
			siguiente = null;
		}
	}

	private Node<K, V>[] cList;

	public static final Integer size = 1000;

	@SuppressWarnings("unchecked")
	public CMHashTable() {
		cList = new Node[size];

	}

	public int fuctionHash(K key) {

		int valorHash = key.hashCode() % size;

		return valorHash;
	}

	public int fuctionHash2(K key) {

		int valorHash = (key.hashCode() & 0x7FFFFFFF) % size;

		return valorHash;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public V put(K key, V value) {

		int indice = fuctionHash(key);

		Node<K, V> old = cList[indice];

		while (old != null) {
			indice = fuctionHashQuadratic(indice);
			old = cList[indice];
		}

		cList[indice] = new Node<K, V>(key, value);

		if (old == null) {
			return null;
		}
		return (V) old.value;
	}

	public int fuctionHashQuadratic(int indice) {

		int c1 = size * 2;
		int c2 = size;

		int valorHash = 1 + (int) ((indice + c1 * indice + c2 * (indice * indice)) % size);

		return valorHash;

	}

	public int fuctionHashLineal(int indice) {

		int valorHash = 1 + (int) ((indice) % size);

		return valorHash;

	}

	public V buscarEnTabla(K key) {

		int indiceB = fuctionHash(key);

		Node<K, V> current = cList[indiceB];

		while (current.key != key) {

			indiceB = fuctionHashQuadratic(indiceB);
			current = cList[indiceB];

		}

		return (V) current.value;

	}

	public V eliminarEnTabla(K key) {

		int indiceB = fuctionHash(key);

		Node<K, V> current = cList[indiceB];

		while (current.key != key) {

			indiceB = fuctionHashQuadratic(indiceB);
			current = cList[indiceB];

		}

		cList[indiceB] = null;

		return (V) current.value;
	}

	public Node<K, V> searchNode(K needed, Node<K, V> current){
		if (!current.key.equals(needed)) {
			return searchNode(needed, current.siguiente);
		}
		else {
			return current;
		}
		
	}
	
	public void addNode(Node<K, V> toAdd, Node<K, V> current) {
		if (current.siguiente==null) {
			current.siguiente= toAdd;
		}else
		{
			addNode(toAdd, current.siguiente);
		}
	}
	
	public Node<K,V> chainingSearch(K key){
		int indice = fuctionHash(key);
		
		Node<K,V> current= cList[indice];
		
		return searchNode(key, current);
		
	}
	
	
	public boolean addChainingFunction(K key, V value) {

		int indice = fuctionHash(key);
		Node<K,V> node= new Node<K, V>(key, value);
		if(cList[indice]==null) {
			cList[indice]= node;
		}else {
			addNode(node, cList[indice]);
		}

		return true;
	}



}
