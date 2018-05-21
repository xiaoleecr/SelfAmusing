package myPractice;

public class Student extends Person {
	@Override
	public boolean equals(Object obj) {
		if(obj == this){
			return true;
		}
		if(null == obj){
			return false;
		}
		if(!(obj instanceof Student)){
			return false;
		}
		final Student stu = (Student)obj;
		if(null!=stu.getScore() && null!=this.getScore() && stu.getScore().longValue()==this.getScore().longValue()){
			return true;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getScore().toString();
	}
	
	private char gender;
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	private Long score;

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	

}
