package project0.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import project0.db.ConnectionFactory;
import project0.entity.Account;
import project0.entity.Transaction;

public class JdbcTransactionRepository implements TransactionRepository {
	
	public void save(Transaction txn) {
		// TODO Auto-generated method stub

	}

	public List<Transaction> findByCount(int count, String accNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> findByMonth(int count, String accNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> findByDateRange(LocalDate fromDate, LocalDate toDate, String accNum) {
		// TODO Auto-generated method stub
		return null;
	}
}
