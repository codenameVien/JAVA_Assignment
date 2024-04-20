package sec01;

class Student{
	
	//필드
	String name;
	int score; 
	String grade;

	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
    void setScore(int score) {
        this.score = score;
    }
    
	int getScore() {
        return score;
    }
	
	void checkScore(int score) {
		if (score>=90) {
			this.grade = "A";
		}
		else if (score>=80) {
			this.grade = "B";
		}
		else if (score>=70) {
			this.grade = "C";
		}
		else if (score>=60) {
			this.grade = "D";
		}
		else {
			this.grade = "F";
		}
	}
	
	String getGrade() {
		return grade;
	}
}


public class StudentExample {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Kim");
		s1.getName();
		s1.setScore(87);
		s1.getScore();
		s1.checkScore(s1.score);
		s1.getGrade();
		System.out.println(s1.name +"학생의 점수는 "+s1.score+"이고 성적은 "+s1.grade+"입니다.");

		Student s2 = new Student();
		s2.setName("Kim");
		s2.getName();
		s2.setScore(59);
		s2.getScore();
		s2.checkScore(s2.score);
		s2.getGrade();
		System.out.println(s2.name +"학생의 점수는 "+s2.score+"이고 성적은 "+s2.grade+"입니다.");


	}

}

