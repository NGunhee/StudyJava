package mystudy;
class Student{
	
	private String dept;
	private int studentNum;
	
	public Student(String dept,int studentNum){
		this.dept=dept;
		this.studentNum=studentNum;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	
}


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("��ǻ�Ͱ��а�", 1001);
		
		s.setDept("��ǻ�ͼ���Ʈ������а�");
		s.setStudentNum(1002);
		System.out.printf("%s %d",s.getDept(),s.getStudentNum());
		
		

	}

}
