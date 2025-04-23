package junitpracticess;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junitPractices.Test_Utils;

public class TestUtils2 {
	
	Test_Utils utils;
	
	@Before
	public void setUp()
	{
		utils=new Test_Utils();
		System.out.println("start");
	}
	@Test
	public void assertEqualsAddition() {
		int result=utils.add(10,5);
		assertEquals(15,result);
	}
	
	@Test
	public void assertEqualsNot() {
		int result=utils.add(10,5);
		assertNotEquals(12,result);
	}
	
	@Test
	@Ignore
	public void assertCheck() {
		List<Integer> data=Arrays.asList(1,2,3,4);
		List list=utils.returnList(data);
		for(Object o : list) {
			Integer i=(Integer)o;
			assertTrue(i%2==0||i%2!=0);
		}
	}
	
	@Test
	public void assertSortedCheck() {
		List<Integer> input=Arrays.asList(1,3,2,4,5);
		List<Integer> expected=Arrays.asList(1,2,3,4,5);
		List<Integer> actual=utils.returnSortedList(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void checkExpression() {
		assertThrows(ArithmeticException.class,()->{
			utils.div(10, 0);
		});
	}
	
	@Test
	public void checkMatchersInList() {
		List<String> input=Arrays.asList("tom","jerry","spike");
		List<String> output=utils.checkMatchers(input);
		
		assertThat(output,hasItem("TOM"));
		assertThat(output,hasItems("TOM","JERRY","SPIKE"));
	}
	
	@After
	public void closeUp() {
		this.utils=null;
		System.out.println("end");
	}
}
