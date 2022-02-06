package CreateStack;
 
/**
 *
 */
public class CreateStack {
	int size;
	int arr[];
	int top;
 
	CreateStack(int size) {
		this.size = 3;
		this.arr = new int[3];
		this.top = -1;
	}
 
	public void push(int pushedNumbers) {
		if (!isFull()) {
			top++;
			arr[top] = pushedNumbers;
			System.out.println("Pushed number:" + pushedNumbers);
		} else {
			System.out.println("Stack is full!");
		}
	}
 
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped number :" + arr[returnedTop]);
			return arr[returnedTop];
 
		} else {
			System.out.println("Empty Stack !");
			return -1;
		}
	}
 

	public boolean isEmpty() {
		return (top == -1);
	}
 
	public boolean isFull() {
		return (size - 1 == top);
	}
 
	public static void main(String[] args) {
		CreateStack StackItem = new CreateStack(3);
		StackItem.pop();
		System.out.println("Pushing");
		
		StackItem.push(2);
		StackItem.push(1);
		StackItem.push(0);
		
		System.out.println("");
		System.out.println("First testing Station:");
		StackItem.pop();
		System.out.println("Second testing Station");
		StackItem.pop();
		System.out.println("Third testing Station");
		StackItem.pop();
		System.out.println("Empty Stack");
	}
}
