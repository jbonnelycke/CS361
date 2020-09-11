/**
 * 
 */
package mystack;

/**
 * @author Jack Bonnelycke
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack != null) {
			T temp = theStack.val;
			theStack = theStack.next;
			return temp;
		} else
			return null;
	}

	
	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v, theStack);
	}

	public T peek() {
		return theStack.val;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> intStack = new MyStack<Integer>();
		// Push 1 and 2
		intStack.push(1);
		intStack.push(2);
		// Pop
		intStack.pop();
		// Push 5
		intStack.push(5);

		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<Person>();
		// Push a person p1 with your name
		Person p1 = new Person("Jack", "Bonnelycke");
		personStack.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Scharff");
		personStack.push(p2);
	}

}
