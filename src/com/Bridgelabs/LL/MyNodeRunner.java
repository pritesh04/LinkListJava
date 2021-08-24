package com.Bridgelabs.LL;

public class MyNodeRunner {
	public static void main(String[] args) {

		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> inBetween = new MyNode<Integer>(30);
		MyLinkedList linkedList = new MyLinkedList();

		linkedList.add(firstNode);
		linkedList.add(thirdNode);
		linkedList.insertSpecific(thirdNode, inBetween);
		linkedList.print();

	}
}
