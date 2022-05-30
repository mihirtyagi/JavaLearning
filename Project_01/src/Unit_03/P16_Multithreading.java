package Unit_03;

import java.util.Scanner;
/*
 * TASKS IN USERS HANDS:
 * 	identify dependent and non-dependent task in respective process
 * 	insert selective task into threads 
 * 	start those threads
 * 
 * 
 * independent and super dependent classes should be used inside Thread
 */

public class P16_Multithreading {

	public static void main(String[] args) {
		
//			C1 obj1 = new C1();
//			obj1.show1();
//			
//			C2 obj2 = new C2();
//			obj2.show2();
		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");
		Thread t3 = new Thread(new T3(),"T3");
		t1.start();
		t2.start();
		t3.start();
	}

}

class C1{
	
	void show1() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println(r);
		System.out.println("Done with show1()!!");
		sc.close();
	}
}


class C2{
	void show2() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"- Hey_2");
		}
	}
}

class T1 extends Thread{
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		//System.out.println(r);
		System.out.println(Thread.currentThread().getName());
		sc.close();
	}
}

class T2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class T3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}