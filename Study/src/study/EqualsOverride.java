package study;

class MyDate{
	private int year;
	private int month;
	private int day;
	
	MyDate(int year, int month , int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof MyDate) {
			MyDate mydate = (MyDate)obj;
			if(this.year==mydate.year&&this.month ==mydate.month&&this.day==mydate.day)
				return true;
			else
				return false;
			
		}
		return false;
		
	}
	
	
}

public class EqualsOverride {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(2022,10,1);
		MyDate d2 = new MyDate(2022,10,1);
		
		System.out.println(d1.equals(d2));
		

	}

}
