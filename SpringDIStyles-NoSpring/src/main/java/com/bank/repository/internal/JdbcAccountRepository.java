package com.bank.repository.internal;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bank.domain.Account;
import com.bank.repository.AccountRepository;

public class JdbcAccountRepository implements AccountRepository {

	private final JdbcTemplate jdbcTemplate;

	/**
	 * 
	 * @param dataSource
	 */
	public JdbcAccountRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Account findById(String srcAcctId) {
		return jdbcTemplate.queryForObject(
				"select id, balance from account where id = ?",
				new AccountRowMapper(), srcAcctId);
	}

	@Override
	public void updateBalance(Account dstAcct) {
		jdbcTemplate.update("update account set balance = ? where id = ?",
				dstAcct.getBalance(), dstAcct.getId());
	}
	
	private static class AccountRowMapper implements RowMapper<Account> {
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Account(rs.getString("id"), rs.getDouble("balance"));
		}
	}



}