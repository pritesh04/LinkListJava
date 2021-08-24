package com.Bridgelabs.LL;

public class MyNodeRunner {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		firstNode.setNext(secNode);
		secNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secNode) && firstNode.getNext().getNext().equals(thirdNode);
		System.out.println(result);

	}
}
