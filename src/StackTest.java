import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testIsEmpty() {
		Stack stack = new Stack();
		assertTrue(stack.isEmpty());
	}
	@Test
	public void testPush() {
		Stack stack = new Stack();
		stack.push(5);
		assertFalse(stack.isEmpty());
	}
	/*
	@Test
	public void testSize() {
		Stack stack = new Stack();
		assertEquals(stack.size());
	}
	*/
}
