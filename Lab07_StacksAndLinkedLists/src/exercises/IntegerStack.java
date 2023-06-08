package exercises;

public class IntegerStack {
	private Integer[] stack;
	private int idx;
	private static final int MAX_STACK_SIZE = 10;
	
	// Constructor
	public IntegerStack() {
		this.stack = new Integer[MAX_STACK_SIZE];
		this.idx = -1;
	}
	
	/**
	 * Pushes a number onto the stack
	 * @param Integer number
	 */
	public void push(Integer number) {
		if (this.idx < MAX_STACK_SIZE - 1) {
			this.idx++;
			this.stack[idx] = number;
		}
	}
	
	/**
	 * Pops a number off the stack
	 * @return Integer
	 */
	public Integer pop() {
		Integer out = null;
		if (this.idx >= 0) {
			out = this.stack[idx];
			this.stack[idx] = null;
			idx-=1;
		}
		return out;
	}
	
	/**
	 * Returns the current top value
	 * @return
	 */
	public Integer top() {
		return this.stack[idx];
	}
	
	/**
	 * Determines if the stack is empty
	 * @return boolean
	 */
	public boolean isEmpty() {
		return (this.idx == -1);
	}
	
	/**
	 * Determines if the stack is full
	 * @return boolean
	 */
	public boolean isFull() {
		return (this.idx == MAX_STACK_SIZE - 1);
	}
	
	@Override
	public String toString() {
		String out = this.top()+"<- TOP\n";
		for(int i = idx-1; i >= 0; i--) {
			out += (i == 0)? this.stack[i] : this.stack[i]+"\n";
		}
		return out;
	}
	

	public static void main(String[] args) {
		IntegerStack intStack = new IntegerStack();
		System.out.println("Is empty: "+intStack.isEmpty()+"\n");
		System.out.println("Stack:");
		intStack.push(50);
		intStack.push(54);
		intStack.push(40);
		intStack.push(20);
		intStack.push(33);
		intStack.push(50);
		intStack.push(54);
		intStack.push(40);
		intStack.push(20);
		intStack.push(33);
		intStack.push(33); // 11th not added
		System.out.println(intStack);
		System.out.println();
		System.out.println("Top value: "+intStack.top());
		System.out.println("Is empty: "+intStack.isEmpty());
		System.out.println("Is full: "+intStack.isFull());
	}

}
