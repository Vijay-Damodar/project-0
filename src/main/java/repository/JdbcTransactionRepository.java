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

//	@Override
//	public void save(double amount, Account fromAccount, Account toAccount) {
//		Connection connection = null;
//		try {
//			connection = ConnectionFactory.getConnection();
//
//			String sql = "insert into transaction(amount, debAccID, creAccID) values(?, ?, ?)";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.setDouble(2, amount);
//			ps.setString(3, fromAccount.getId());
//			ps.setString(4, toAccount.getId());
//			ps.execute();
//			System.out.println("Transaction Updated......");
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (connection != null) {
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
}
