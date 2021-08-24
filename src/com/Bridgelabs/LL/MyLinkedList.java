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

	public void insertSpecific(INode old, INode newNode) {
		INode temp = head, t = head;
		while (!temp.equals(old)) {
			t = temp;
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);

	}
	public void deleteFirstElement() {

		INode tempNode = null;
		tempNode = head;
		head = head.getNext();
		System.out.println("deleted " + tempNode.getkey());
		tempNode = null;

	}
	public void deleteLastElement() {
		INode t1 = head, t2 = head;
		while (t2 != tail) {
			t1 = t2;
			t2 = t2.getNext();
		}
		tail=t1;
		t2 = null;

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
