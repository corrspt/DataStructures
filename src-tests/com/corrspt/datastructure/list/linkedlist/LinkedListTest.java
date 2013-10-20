package com.corrspt.datastructure.list.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testLinkedList() {
		LinkedList<String> sut = new LinkedList<String>();
		assertTrue(sut.size() == 0);
	}

}
