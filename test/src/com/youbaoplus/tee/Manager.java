package com.youbaoplus.tee;

public  class Manager extends Employee {
	
	
	private int bounds;
	
	
	public int getBounds() {
		return bounds;
	}



	public void setBounds(int bounds) {
		this.bounds = bounds;
	}

	


	public Manager(String name,int age,int bounds) {
		super(name,age);
		this.bounds = bounds;
	}



	@Override
	public int getSalary() {
		
		return super.getSalary()+this.bounds;
	}
	
	

	@Override
	public String toString() {
		
		return "Name="+this.getName()+",age="+this.getAge()+",salary="+this.getSalary();
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.printf("%d %s", 10,"niao");
		System.out.println(max(19,20,30));

	}

	
	public static double max(double... values){
		double largest=Double.MIN_VALUE;
		for (double v : values) {
			if(v>largest){
				largest=v;
			}
		}
		
		return largest;
	}
	

}
