
public class Stack {

	private int[] stackSize;
	private int top;

	Stack(int Size) {
		stackSize = new int[Size];
		top = -1;
	}

	public void push(int el) {

		stackSize[++top] = el;
	}

	public int pop() {
		return stackSize[top--];
	}

	public boolean isEmpty() {

		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == stackSize.length) {
			return true;
		}
		return false;
	}

	public int peek() {
		return stackSize[top];
	}

	public int returnSize() {
		return top + 1;
	}

	public void view() {

		for (int i = 0; i <= top; i++)

			System.out.print(stackSize[i] + " ");

		System.out.println();

	}

}
