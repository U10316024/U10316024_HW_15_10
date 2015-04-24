//main class
//test deep copy
public class TestStack {

	//main method
	public static void main(String[] args) {
		MyStack stack1 = new MyStack();

		//輸入三個字串
		stack1.push("String1");
		stack1.push("String2");
		stack1.push("String3");

		//stack2 deep copy stack1
		MyStack stack2 = (MyStack)stack1.clone();
	
		//輸入三個字串
		stack2.push("String1");
		stack2.push("String2");
		stack2.push("String3");

		//print stack1 的 ArrayList size
		System.out.println("stack1 : " + stack1.getSize());

		//print stack2 的 ArrayList size
		//因為stack2 deep copy stack1 所以stack2的ArrayList的size為stack1+stack2
		System.out.println("stack2 : " + stack2.getSize());
	}
}
