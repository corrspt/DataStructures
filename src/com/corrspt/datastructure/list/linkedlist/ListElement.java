package com.corrspt.datastructure.list.linkedlist;

class ListElement<E> {

	private E element;
	
	private ListElement<E> next;
	
	
	public ListElement(E elem){
		this.element = elem;
	}
	
	E getElement(){
		return element;
	}
	
	ListElement<E> getNext(){
		return next;
	}
	
	void setNext(ListElement<E> nextElem){
		this.next = nextElem;
	}
	
}
