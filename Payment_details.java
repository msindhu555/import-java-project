package org.import2;

import javax.persistence.Column;
import javax.persistence.Id;

public class Payment_details {
	@Column(name="pay_id")
	private int paymentId;
	@Id
	@Column(name="company_id")
	private int importCompanyId;
	@Column(name="pay_type")
	private String paymentMode;
	@Column(name="pay_amount")
	private int PaymentAmount;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getImportCompanyId() {
		return importCompanyId;
	}
	public void setImportCompanyId(int importCompanyId) {
		this.importCompanyId = importCompanyId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getPaymentAmount() {
		return PaymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		PaymentAmount = paymentAmount;
	}
	

}
