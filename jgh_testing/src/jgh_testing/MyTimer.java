package jgh_testing;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer(true);
		TimerTask task1 = new MyTimeTask();
		System.out.println("task1은 잠시 후에 실행됩니다.");
		TimerTask task2 = new YourTimeTask();
		System.out.println("task2은 잠시 후에 실행됩니다.");
		t.schedule(task1, 1000);
		t.schedule(task2, 7000);
		
		Thread.sleep(11000);//실행시 까지 대기
		System.out.println("이제 모든 것을 종료합니다.");
	}
}
