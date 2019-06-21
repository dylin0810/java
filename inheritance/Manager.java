package inheritance;

public class Manager extends Employee{
	private double bonus;
	public Manager(String name,double salary,int year,int month,int day) {
		// TODO Auto-generated constructor stub
		super(name, salary, year, month, day);
		bonus = 0;
	}
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		double baseSalary = super.getSalary();
		return baseSalary+bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
