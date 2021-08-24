package com.Bridgelabs.LL;

public class MyLinkedList {

	private INode head;
	private INode tail;
	
	public void add(INode myNode) {
		if (tail == null) {
			tail = myNode;
		}
		if (head == null) {
			head = myNode;
		} else {
			INode tempNode = head;
			head = myNode;
			head.setNext(tempNode);
		}

	}
	
	public void append(INode myNode) {
		if (head == null) {
			head = myNode;
		}
		if (tail == null) {
			tail = myNode;
		} else {

			tail.setNext(myNode);
			tail = myNode;
		}
	}
	public void print() {
		INode tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getkey());
			if (!tempNode.equals(tail)) {
				System.out.print("->");
			}
			tempNode = tempNode.getNext();
			
		}

	}
	

}


