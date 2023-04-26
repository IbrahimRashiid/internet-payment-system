package com.software.Phase2.registeration;

public class User {
	    private String userName;
	    private String email;
	    private String password ;
		private double walletBalance;

	public double getWalletBalance() {
		return 200.0;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public String getUserName(){return this.userName;}

	
	    public String getEmail() {
	        
	        return email;
	    }

	    public String getPassword() {
	        
	        return password;
	    }

}
