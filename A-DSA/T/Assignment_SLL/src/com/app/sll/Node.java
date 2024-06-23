package com.app.sll;

public class Node {
	
	private int data;
	private Node next;
	//private static int cnt;
	
	//public int count=0;
	
	
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
		//this.count=cnt++;
		
	}
	
	
//	public static int getCnt() {
//		return cnt;
//	}
//
//
//	public static void setCnt(int cnt) {
//		Node.cnt = cnt;
//	}


	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	 
	

}
