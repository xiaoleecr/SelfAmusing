package myPractice;

public class Person {

	Person() {
	}
	Person(String name){
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void whatName(){
		System.out.println("the name is:"+this.name);
	}
	
}
