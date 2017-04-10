package MaxNumInStack;

class TestMaxStack {
	public static void main(String args[]) {
		MaxNumInStack ints = new MaxNumInStack();
		ints.push(10);
		System.out.println("max " + ints.maxValue());
		ints.push(20);
		System.out.println("max " + ints.maxValue());
		ints.push(30);
		System.out.println("max " + ints.maxValue());
		System.out.println("pop " + ints.pop());
		System.out.println("max " + ints.maxValue());
	}
}