
public class Stack {
	int values[];
	int index = 0;

	Stack() {
	    this(10);
	}

	Stack(int capacity) {
		values = new int[capacity];
	}

	public boolean isEmpty() {
		if ( index == 0 ) {
			return true;
		}
		return false;
	}

	public void push(int num) {
		values[index] = num;
		index++;
	}

}
