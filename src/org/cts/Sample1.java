package org.cts;

public class Sample1 {
	
	private void master() {

		System.out.println("master");
	}
	
	private void yusuf1() {

		System.out.println("Yusuf1");
	}
	
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.master();
		s.yusuf1();
	}

}
