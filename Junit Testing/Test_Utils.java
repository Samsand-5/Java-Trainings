package junitPractices;

import java.util.List;

public class Test_Utils {
	
	public int add(int x,int y) {
		return x+y;
	}
	
	public List returnList(List list) {
		return list;
	}
	
	public List<Integer> returnSortedList(List<Integer> list) {
		return list.stream().sorted().toList();
	}
	
	public int div(int x,int y) throws ArithmeticException{
		if(y!=0) {
			return x/y;
		}
		throw new ArithmeticException("deno is zero(0)");
	}
	
	public List<String> checkMatchers(List<String> list){
		return list.stream().map(String::toUpperCase).toList();
	}
}
