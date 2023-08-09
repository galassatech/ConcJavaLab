package Exercise2;

public class ListImpl implements IntegerSet {
	private class Node {
		public Node(int i) {
			item = i;
		}
	
		private int item;
		private Node next;
	}
	
	private Node head;
	
	public ListImpl() {
		head = new Node(Integer.MIN_VALUE);
		head.next = new Node (Integer.MAX_VALUE);
	}
	
	@Override
	public boolean add(int i) {
		Node pred = head;
		Node curr = pred.next;
		while (curr.item < i){
			pred = curr;
			curr = curr.next;
		}
	 
		if (curr.item == i){
			return false;
		}
		
		Node newNode = new Node(i);
		newNode.next = curr;
		pred.next = newNode;
		return true;
	}

	@Override
	public boolean contains(int i) {
		Node curr = head;
		
		while (curr.item < i){
			curr = curr.next;
		}
		
		return (curr.item == i);
	}

	@Override
	public boolean remove(int i) {
		Node pred = head;
		Node curr = pred.next;
		
		while (curr.item < i){
			pred = curr;
			curr = curr.next;
		}
		
		if (curr.item == i){
			pred.next = curr.next;
			return true;
		}
		
		return false;
	}
}
