package tw.brad.myclasses;

public class MyTest2 {
	private int age;
	private String name;
	
	public MyTest2(int age) {
		this.age = age;
	}
	
	public int getAge() {return age;}
	
	@Override
	public boolean equals(Object obj) {
		return age == ((MyTest2)obj).getAge();
	}
	
	@Override
	public String toString() {
		return "I am " + age;
	}
}
