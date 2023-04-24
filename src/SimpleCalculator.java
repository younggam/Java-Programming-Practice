//import java.util.Scanner;
//
////2020311882 서인주 
//public class SimpleCalculator {
//	public static void main(String[] args) {
//		var calculator = new SimpleCalculator();
//		var scanner = new Scanner(System.in);
//		var inputs = scanner.nextLine();
//		var plus = inputs.split("[+]");
//		var minus = inputs.split("-");
//		if (plus.length == 2) {
//			System.out.println(calculator.plus(Integer.parseInt(plus[0]), Integer.parseInt(plus[1])));
//		} else if (minus.length == 2) {
//			System.out.println(calculator.minus(Integer.parseInt(minus[0]), Integer.parseInt(minus[1])));
//		}
//		scanner.close();
//	}
//
//	public int plus(int left, int right) {
//		if (left == 0 || right == 0)
//			throw new AddZeroException("AddZeroException");
//		var ret = left + right;
//		if (left > 1000 || left < 0 || right > 1000 || right < 0 || ret > 1000 || ret < 0)
//			throw new OutOfRangeException("OutOfRangeException");
//		return ret;
//	}
//
//	public int minus(int left, int right) {
//		if (left == 0 || right == 0)
//			throw new SubtractZeroException("SubtractZeroException");
//		var ret = left - right;
//		if (left > 1000 || left < 0 || right > 1000 || right < 0 || ret > 1000 || ret < 0)
//			throw new OutOfRangeException("OutOfRangeException");
//		return ret;
//	}
//
//	public class OutOfRangeException extends RuntimeException {
//		public OutOfRangeException() {
//			super();
//		}
//
//		public OutOfRangeException(String message) {
//			super(message);
//		}
//	}
//
//	public class AddZeroException extends RuntimeException {
//		public AddZeroException() {
//			super();
//		}
//
//		public AddZeroException(String message) {
//			super(message);
//		}
//	}
//
//	public class SubtractZeroException extends RuntimeException {
//		public SubtractZeroException() {
//			super();
//		}
//
//		public SubtractZeroException(String message) {
//			super(message);
//		}
//	}
//}