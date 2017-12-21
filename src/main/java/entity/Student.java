
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id

	private String email;
	private String firstName;
	private String lastName;
	private int age;
	
	public Student() {}
	
	public Student(String email, String firstName, String lastName, int age) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
