package org.cts;

public class Sample1 {
	
	private void master() {

		System.out.println("master");
	}
	
	private void yusuf() {

		System.out.println("Yusuf");
	}
	
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.master();
		s.yusuf();
	}

}
