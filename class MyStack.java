//MyStack 實作 Cloneable 的類別
class MyStack implements Cloneable{

	
	private ArrayList<Object> list = new ArrayList<Object>();

	//boolean method
	public boolean isEmpty() {
		return list.isEmpty();
	}

	//get method
	public int getSize() {
		return list.size();
	}

	//peek method
	public Object peek() {
		return list.get(getSize() - 1);
	}

	//pop method
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	//push method
	public void push(Object o) {
		list.add(o);
	}

	//toString method
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

	//clone method
	public Object clone() {
		try {
			MyStack stack = (MyStack)super.clone();
			stack.list = (ArrayList<Object>)list.clone();
			return stack;
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}
