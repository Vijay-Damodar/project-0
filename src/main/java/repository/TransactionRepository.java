package project0.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import project0.db.ConnectionFactory;
import project0.entity.Account;
import project0.entity.Transaction;

public interface TransactionRepository {
	
	public static void save(double amount, Account fromAccount, Account toAccount) {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			java.util.Date date = new  Date();
			String sql = "insert into transaction(amount, debAccID, creAccID,dateTime) values(?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			
			ps.setDouble(1, amount);
			ps.setString(2, fromAccount.getId());
			ps.setString(3, toAccount.getId());
			ps.setTimestamp(4, new Timestamp(date.getTime()));
			ps.execute();
			System.out.println("Transaction Updated......");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
		

	List<Transaction> findByCount(int count, String accNum);
	List<Transaction> findByMonth(int count, String accNum);
	List<Transaction> findByDateRange(LocalDate fromDate,LocalDate toDate,String accNum);
}