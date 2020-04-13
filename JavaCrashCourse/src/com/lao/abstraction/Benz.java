package com.lao.abstraction;

public class Benz extends Car{
	@Override
    public void engineSecret()
    {
    	System.out.println("Benz Engine Secret");
    }
    public void CompanyVault()
    {
    	System.out.println("Benz Company Vault");
    }
	public static void main(String[] args) {
		//USING (DYNAMIC POLYMORPHISM) - overriding below
				Car car=new Benz();
				car.engineSecret();
				car.CompanyVault();

	}
	

}
 