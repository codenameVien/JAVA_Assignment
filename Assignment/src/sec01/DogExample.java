package sec01;

class Dog {
	//필드
	String name;
	String breeds;
	int age;

	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
    void setBreeds(String breeds) {
        this.breeds = breeds;
    }
    
	String getBreeds() {
        return breeds;
    }
	
    public void setAge(int age) {
        this.age = age;
    }
    
	int getAge() {
        return age;
    }
	
	String tail() {
		return "살랑살랑";
	}
	
	String bark() {
		return "멍멍!";
	}
}



public class DogExample {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.setName("망고"); 
		d1.setBreeds("골든리트리버");
		d1.setAge(2);
		d1.getName();
		d1.getBreeds();
		d1.getAge();
		String a = d1.tail();
		System.out.println("[" + d1.name +"] " + a);
		
		Dog d2 = new Dog();
		d2.setName("까미"); 
		d2.setBreeds("믹스");
		d2.setAge(3);
		d2.getName();
		d2.getBreeds();
		d2.getAge();
		String b = d2.bark();
		System.out.println("[" + d2.name +"] " + b);
	}
}