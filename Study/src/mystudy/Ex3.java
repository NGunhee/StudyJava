package mystudy;

class SalaryMan{
	public int salary=1000000;
	
	public int getAnnualGross() {
		return (salary*12)+(salary*5);
	}
	
	public SalaryMan() {
		
	}
	public SalaryMan(int salary) {
		this.salary=salary;
	}
	
}


public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());

	}

}
