package com.bank.service.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.bank.service.FeePolicy;

@Repository
public class FlatFeePolicy implements FeePolicy {

	private final double flatFee;

	@Autowired
	public FlatFeePolicy(@Value("${flatfee.amount}") double flatFee) {
		this.flatFee = flatFee;
	}

	public double calculateFee(double transferAmount) {
		return flatFee;
	}

}
