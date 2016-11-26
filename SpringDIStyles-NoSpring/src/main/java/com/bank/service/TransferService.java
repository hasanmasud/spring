package com.bank.service;

import com.bank.domain.InsufficientFundsException;
import com.bank.domain.TransferReceipt;

public interface TransferService {

	/**
	 * 
	 * @param amount
	 * @param srcAcctId
	 * @param destAcctId
	 * @return
	 * @throws InsufficientFundsException
	 */
	public TransferReceipt transfer(double amount, String srcAcctId, String destAcctId) throws InsufficientFundsException;

	/**
	 * 
	 * @param minimumTransferAmount
	 */
	public void setMinimumTransferAmount(double minimumTransferAmount);

}