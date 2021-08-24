package com.Bridgelabs.LL;

interface INode<K> {
	K getkey();

	void setKey(K key);

	INode getNext();

	void setNext(INode next);

}
