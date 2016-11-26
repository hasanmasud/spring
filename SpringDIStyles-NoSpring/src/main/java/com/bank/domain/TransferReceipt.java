package com.bank.domain;
public class TransferReceipt {

	private double transferAmount;
	private double feeAmount;
	private Account initialSourceAccountCopy;
	private Account initialDestinationAccountCopy;
	private Account finalSourceAccountCopy;	
	private Account finalDestinationAccountCopy;

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public double getTransferAmount() {
		return this.transferAmount;
	}

	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public double getFeeAmount() {
		return this.feeAmount;
	}

	public void setInitialSourceAccount(Account account) {
		this.initialSourceAccountCopy = Account.copy(account);
	}

	public void setFinalSourceAccount(Account account) {
		this.finalSourceAccountCopy = Account.copy(account);
	}

	public Account getFinalSourceAccount() {
		return this.finalSourceAccountCopy;
	}

	public void setInitialDestinationAccount(Account account) {
		this.initialDestinationAccountCopy = Account.copy(account);
	}

	public void setFinalDestinationAccount(Account account) {
		this.finalDestinationAccountCopy = Account.copy(account);
	}

	public Account getFinalDestinationAccount() {
		return this.finalDestinationAccountCopy;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
			sb.append("transferred");
		return sb.toString();
	}

}