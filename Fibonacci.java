public class Fibonacci {
	private static int[] precalculated = null;

	public static int withoutMemoFib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = withoutMemoFib(n-1) + withoutMemoFib(n-2);
			return result;
		}
	}

	public static int withMemoFib(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			int result = withMemoFib(n-1) + withMemoFib(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}

	private static void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}

}