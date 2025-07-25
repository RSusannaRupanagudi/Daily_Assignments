package oops;

public class Admin extends Person{
	private String role;

	public Admin(String name, int age,String role) {
		super(name, age);
		this.role=role;
		// TODO Auto-generated constructor stub
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		if(!role.isEmpty())
		this.role = role;
		else
			System.out.println("role cannot empty");
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Admin Details:");
		System.out.println("Nmae: "+name);
		System.out.println("Age: "+age);
		System.out.println("role: "+role);
		
		
	}
	@Override
	public void showRole() {
		System.out.println(name+" is an admin");
	}

}
