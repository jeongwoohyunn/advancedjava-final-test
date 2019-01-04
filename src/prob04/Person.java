package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;
	static int count=0;

	public Person( String name ){
		age=12;
		name = "";
		
	}
	
	public Person(int age, String name){
		
		numberOfPerson++;
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void selfIntroduce(){
		System.out.println("내 이름은 "+getName() +"이며, 나이는 "+getAge() +"살 입니다.");
	}

	static int getPopulation(){
		// 전체 인구수를 return 함
		return numberOfPerson+1;
	}
}

