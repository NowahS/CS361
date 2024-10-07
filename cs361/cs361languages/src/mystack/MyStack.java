/**
 * 
 */
package mystack;

/**
 * @author Nowah Stewart
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
		
		if(theStack == null){ //if stack is empty return null
			return null;
		}
		T topVal = theStack.val; //establishes top value of the stack
		theStack = theStack.next; //moves position of the stack to the next, removing the top value
		return topVal;
	}

	public void push(T v) {
		// TODO To complete

		theStack = new MyNode<>(v, theStack); //creates a new stack with the new node as the top
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		
		MyStack<Integer> Istack= new MyStack<>();
		
		// Push 1 and 2

		Istack.push(1);
		Istack.push(2);

		// Pop

		Istack.pop();

		// Push 5

		Istack.push(5);
		
		// TODO To complete
		// Create a stack of Person

		MyStack<Person> personStack = new MyStack<>();

		// Push a person p1 with your name

		Person p1 = new Person("Nowah", "Stewart");
		personStack.push(p1);

		// Push a person p2 with my name

		Person p2 = new Person("Christelle", "Schraff");
		personStack.push(p2);

		//Test to make sure the stack is working correctly
		Person pop1 = personStack.pop();
		System.out.println(pop1.getFname() + " " + pop1.getLname()); //should print out p2
		Person pop2 = personStack.pop();
		System.out.println(pop2.getFname() + " " + pop2.getLname()); //should print out p1
	}

}
