package com.shiva;

public class BillCollector {
	private IPayment payment;

	public void setPayment(IPayment payment) {
		this.payment=payment;
	}
	public BillCollector() {}
	
	public BillCollector(IPayment payment) {
		this.payment=payment;
	}
	public void collectPayment(double amount) {
		String pay = payment.pay(amount);
		System.out.println(pay);
	}
	
	
}
