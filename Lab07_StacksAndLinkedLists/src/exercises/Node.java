package exercises;

public class Node {
	private Node prev;
	private Node next;
	private Integer value;

	// Constructor
	public Node(Integer value) {
		this.next = null;
		this.prev = null;
		this.value = value;
	}

	/**
	 * Appends a new value to the end of the linked list
	 * @param Integer value
	 */
	public void add(Integer value) {
		if (this.next == null) {
			this.next = new Node(value);
			this.next.prev = this;
		} else {
			this.next.add(value);
		}
	}
	
	/**
	 * Removes a specified value from the list
	 */
	public void remove(int value) {
		Node target = this.find(value);
		if(target.next != null) {
			target.next.prev = target.prev;
		}
		if(target.prev != null) {
			target.prev.next = target.next;
		}
		target = null;
	}

	/**
	 * Returns the head of the linked list
	 * @return Node head
	 */
	public Node getHead() {
		return (this.prev == null) ? this : this.prev.getHead();
	}

	/**
	 * Returns the tail of the linked list
	 * @return Node tail
	 */
	public Node getTail() {
		return (this.next == null) ? this : this.next.getTail();
	}
	
	/**
	 * Finds the specified number and returns the Node
	 * @param int number
	 * @return Node
	 */
	public Node find(int number) {
		if(this.value == number) {
			return this;
		}
		if (this.next == null) {
			return null;
		}
		return this.next.find(number);
	}
	
	@Override
	public String toString() {
		Node node = this;
		String out = "("+node.value+")";
		while(node.next != null) {
			node = node.next;
			out += " -> ("+node.value+")";
		}
		return out;
	}

	public static void main(String[] args) {
		Node node = new Node(10);
		node.add(11);
		node.add(32);
		node.add(1451);
		node.add(1431);
		node.add(131);
		node.add(121);
		System.out.println(node);
		System.out.println(node.getTail());
		System.out.println(node.getHead());
		System.out.println(node.find(1431));
		node.remove(1431);
		System.out.println(node);
	}
}
