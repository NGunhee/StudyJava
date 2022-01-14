package Collection;

import java.util.ArrayList;

class myStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public ArrayList<String> getArrayStack() {
		return arrayStack;
	}
	public void setArrayStack(ArrayList<String> arrayStack) {
		this.arrayStack = arrayStack;
	}
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		int len =arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len-1);
	}

}
public class StackTest{
	
	public static void main(String[] args) {
		
		myStack stack = new myStack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("2");
		stack.push("2");
	
		for(int i=0;i<stack.getArrayStack().size();i++) {
			String s= stack.getArrayStack().get(i);
			System.out.println(s);
		}
		
	}
	
}
