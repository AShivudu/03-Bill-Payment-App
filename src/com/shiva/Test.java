package com.shiva;

public class Test {
	public static void main(String[] args) {
		BillCollector bc = new BillCollector();
		bc.setPayment(new CreditCardPayment());
		bc.collectPayment(1500.00);
		
		BillCollector bc1 = new  BillCollector(new DebitCardPayment());
		bc1.collectPayment(1550.00);
		
		BillCollector bc2 = new  BillCollector(new UPIPayment());
		bc2.collectPayment(1600.00);
	}
}
