package com.software.Phase2.Refund;

public class Refund {
	 private String serviceName;
	    private int refundAmount;
	    private boolean status=false;
		private String userName;

	public Refund(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public boolean isStatus() {
	        return status;
	    }

	    public void setStatus(boolean status) {
	        this.status = status;
	    }

	    public Refund(String serviceName, int refundAmount) {
	        this.serviceName = serviceName;
	        this.refundAmount = refundAmount;
	    }

	    public String getServiceName() {
	        return serviceName;
	    }

	    public void setServiceName(String serviceName) {
	        this.serviceName = serviceName;
	    }

	    public int getRefundAmount() {
	        return refundAmount;
	    }

	    public void setRefundAmount(int refundAmount) {
	        this.refundAmount = refundAmount;
	    }
}
