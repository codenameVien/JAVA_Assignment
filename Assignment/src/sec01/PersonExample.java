package sec01;

class Person {
	
	//필드(속성)
	String name;
	int age; 

	// 생성자를 만들지 않았으므로 컴파일러가 기본 생성자를 만들어줌 
	// 자동 추가되는 코드 : public Person(){} //기본생성자 -> 그래서 new Person()이 가능해지는거랍니
	
	void setName(String inputName) {
		name = inputName; // 야 this 생략해도 실행되는디? 
		                  // this.name = name처럼 같을때 헷갈리니까 써주는거
	}
	
	void setAge(int inputAge) {
		age = inputAge;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}


public class PersonExample {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("홍길동");
		person1.setAge(25);
		person1.getName();
		person1.getAge();
		System.out.println("이름 : "+ person1.name);
		System.out.println("나이 : "+ person1.age);
		
		Person person2 = new Person();
		person2.setName("이순신");
		person2.setAge(21);
		person2.getName();
		person2.getAge();
		System.out.println("이름 : "+ person2.name);
		System.out.println("나이 : "+ person2.age);

		

	}

}
