package task;

class Person1 {
	
	String name;
	int age;
	
	public Person1(String name,int age) {
		
		this.name=name;
		this.age=age;
	}
	
	public String getname() {
		
		return name;
		
	}
	
	public int getage() {
		
		return age;
	}
	
}

public class Test3PersonConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person1 per1=new Person1("Basith",24);
		
		String nm=per1.getname();
		int ag=per1.getage();
		
		System.out.println("Person Details 1:");
		System.out.println("Person Name :" +nm);
		System.out.println("Person Age :" +ag);
		
		System.out.println();

	}

}
