package Collection;

import java.util.ArrayList;

class myQueue{
	private ArrayList<String> queue = new ArrayList<String>();
	
	public ArrayList<String> getQueue() {
		return queue;
	}
	public void setQueue(ArrayList<String> queue) {
		this.queue = queue;
	}
	public void enqueue(String s) {
		queue.add(s);
	}
	public String dequeue() {
		
		int len = queue.size();
		if(queue.get(0).equals(null)) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return queue.remove(0);
	}
}

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myQueue q = new myQueue();
		
		q.enqueue("1");
		q.enqueue("2");
		q.enqueue("3");
		q.dequeue();
		q.enqueue("2");
		q.enqueue("2");
		q.dequeue();
		
		
		for(int i=0;i<q.getQueue().size();i++) {
			String s= q.getQueue().get(i);
			System.out.print(" "+s);
		}
		

	}

}
