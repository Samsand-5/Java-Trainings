package encapsultion;

import java.util.Scanner;

public class Student {
	private String name = "Rohit";
	private int age = 26;
	public void getName(int password) {
		if(this.password==password)
			System.out.println(name);
		else
			System.out.println("Invalid password");
	}
	public void setName(String name,int password) {
		if(this.password==password)
			this.name = name;
		else
			System.out.println("Invalid password");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	public void displayDetails() {
		System.out.println(name+" "+age+" "+gender+" "+branch+" "+email+" "+password);
	}
	private String gender = "Male";
	private String branch = "CSE";
	private String email = "rohit@gmail.com";
	private int password = 1234;
	
	
	public void updatePassword(int password) {
		if(this.password==password) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter new password");
			int newPassword = scan.nextInt();
			System.out.println("Confirm new password");
			int confirmPassword = scan.nextInt();
			if(newPassword==confirmPassword) {
				this.password=confirmPassword;
				System.out.println("Password updated");
			}
			else {
				System.out.println("confirmation of new password failed");
			}
		}
		else {
			System.out.println("Invalid password");
		}
	}
}
