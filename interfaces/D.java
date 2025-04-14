package interfaces;

import java.io.Serializable;

public class D implements A,B ,Serializable{

	@Override
	public void print() {
		A.super.print();
	}
	
	public static void main(String[] args) {
		D d = new D(); 
		d.print();
	}
}
