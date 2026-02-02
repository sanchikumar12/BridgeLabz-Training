package com.functionaiInterfaces.passwordstrengthvalidator;

public class InsurancePortal {
	public static void main(String[] args) {
		String password = "Kesha4";
		
		if (PasswordStrength.SecurityUtils(password)) {
            System.out.println("Strong password accepted");
        } else {
            System.out.println("Weak password");
        }
	}
}
