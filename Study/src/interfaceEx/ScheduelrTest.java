package interfaceEx;

import java.io.IOException;

public class ScheduelrTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담원에 할당 방식을 선택하세요");
		System.out.println("R:한명씩 차례대로");
		System.out.println("L:대기가 적은 상담원 우선");
		System.out.println("P:우선순위가 높은 고객우선 숙련도 높은 상담원");
		
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
			System.out.println("r,l,p만 입력해주세요");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
