package com.interfaceimplementation.basicimplementation.digitalpayment;

public class DigitalPaymentMain {

	public static void main(String[] args) {

        Payment upi = new UpiPayment();
        Payment card = new CreditCardPayment();
        Payment wallet = new WalletPayment();

        upi.pay(500);
        card.pay(1500);
        wallet.pay(300);
    }
}
