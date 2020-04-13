package com.lao.abstraction;

public class BMW extends Car implements Upcomingprojects,Interface2{
    @Override
    public void engineSecret()
    {
    	System.out.println("BMW Engine Secret");
    }
    public void CompanyVault()
    {
    	System.out.println("BMW Company Vault");
    }

	public static void main(String[] args) {
		//USING (DYNAMIC POLYMORPHISM) - overriding below
		Car car=new BMW();
		car.engineSecret();
		car.CompanyVault();
		car.method2();
		car.method3();
	}	
	@Override
	public void method2() {
		System.out.println("This is Method2");
		
	}
	@Override
	public void method3() {
		System.out.println("This is Method3");
		
	}
	
}
 