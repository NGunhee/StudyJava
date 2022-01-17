package interfaceEx;

import java.io.IOException;

public class ScheduelrTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ������ �Ҵ� ����� �����ϼ���");
		System.out.println("R:�Ѹ� ���ʴ��");
		System.out.println("L:��Ⱑ ���� ���� �켱");
		System.out.println("P:�켱������ ���� ���켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch=='R')
			scheduler = new RoundRobin();
		else if(ch=='L') {
			scheduler= new LeastJob();
		}
		else if(ch=='P') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("r,l,p�� �Է����ּ���");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
