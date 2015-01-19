import org.junit.*;
import static org.junit.Assert.*;

public class FibonacciTest {

	/**
	 * Tests that the withoutMemoFib() returns the 46th number of the Fibonacci sequence.
	 */
	@Test
	public void shouldReturn50thUsingWithoutMemo() {
		int expected = 1836311903;
		int actual = Fibonacci.withoutMemoFib(46);
		assertEquals(expected, actual);
	}

	/**
	 * Tests that the withMemoFib() returns the 46th number of the Fibonacci sequence.
	 */
	@Test
	public void shouldReturn50thUsingWithMemo() {
		int expected = 1836311903;
		int actual = Fibonacci.withMemoFib(46);
		assertEquals(expected, actual);
	}

	/**
	 * Tests that both Fibonacci methods return the same result.
	 */
	@Test
	public void shouldReturnTheSameResult() {
		int without = Fibonacci.withoutMemoFib(46);
		int with = Fibonacci.withMemoFib(46);
		assertEquals(with, without);
	}

	/**
	 * Tests the speed of withMemoFib().
	 */
	@Test(timeout = 1000)
	public void shouldNotTimeoutBefore1000UsingWith() {
		int expect = Fibonacci.withMemoFib(46);
	}

	/**
	 * Tests the speed of withoutMemoFib().
	 */
	@Test(timeout = 5000)
	public void shouldNotTimeoutBefore1000UsingWithout() {
		int expect = Fibonacci.withoutMemoFib(46);
	}
}