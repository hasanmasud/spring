package com.bank.repository;
import com.bank.domain.Account;

public interface AccountRepository {

	/**
	 * 
	 * @param srcAcctId
	 * @return
	 */
	public Account findById(String srcAcctId);

	/**
	 * 
	 * @param dstAcct
	 */
	public void updateBalance(Account dstAcct);

}