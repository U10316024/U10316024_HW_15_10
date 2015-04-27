//main class
//test deep copy
public class TestStack {

	//main method
	public static void main(String[] args) {
		MyStack stack1 = new MyStack();

			//輸入字串
			stack1.push("!");
			stack1.push("Y");
			stack1.push("A");
			stack1.push("D");
			stack1.push("H");
			stack1.push("T");
			stack1.push("R");
			stack1.push("I");
			stack1.push("\nB");

		//stack2 deep copy stack1
		MyStack stack2 = (MyStack)stack1.clone();
	
			//輸入字串
			stack2.push("Y");
			stack2.push("P");
			stack2.push("P");
			stack2.push("A");
			stack2.push("H");

		//print stack1 的 ArrayList size
		System.out.println("stack1 : " + stack1.getSize());

		//print stack2 的 ArrayList size
		//因為stack2 deep copy stack1 所以stack2的ArrayList的size為stack1+stack2
		System.out.println("stack2 : " + stack2.getSize());

		MyStack stack3 = (MyStack)stack2.clone();
		
		//將stack1+stack2的字串顛倒印出
		while (!(stack2.isEmpty())) {
			System.out.println(stack3.pop());
		}				
	}
}
