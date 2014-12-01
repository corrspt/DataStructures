package com.corrspt.datastructure.list.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class LinkedListTest {

	@Test
	public void empty_list_size() {
		LinkedList<String> sut = new LinkedList<String>();
		assertTrue("List should be empty",sut.size() == 0);
	}

	@Test
	public void one_element_size(){
		LinkedList<String> sut = new LinkedList<String>();
		sut.add("random");
		String element = sut.get(0);
		assertTrue("List should have one element",sut.size() == 1);
		assertTrue("Did not return 'random' string", "random".equals(element));
	}
	
	@Test
	public void two_element_size_and_get(){
		LinkedList<String> sut = new LinkedList<String>();
		sut.add("random");
		sut.add("second");
		String first = sut.get(0);
		String second = sut.get(1);
		assertTrue("List should have two elements",sut.size() == 2);
		assertTrue("Did not return 'random' string", "random".equals(first));
		assertTrue("Did not return 'second' string", "second".equals(second));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void negative_index_throws_exception(){
		LinkedList<String> sut = new LinkedList<String>();
		sut.get(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void oversize_index_throws_exception(){
		LinkedList<String> sut = new LinkedList<String>();
		sut.get(sut.size() + 1);
	}
	
	@Test
	public void clear_list() throws Exception {
		
		LinkedList<String> sut = new LinkedList<String>();
		
		sut.add("Test");
		sut.add("Before");
		
		assertTrue( sut.size() > 0 );
		
		sut.clear();
		
		assertTrue("After clear, size should be zero", sut.size() == 0 );
	}
	
}
