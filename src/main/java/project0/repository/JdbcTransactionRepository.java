package project0.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import project0.db.ConnectionFactory;
import project0.entity.Transaction;

public class JdbcTransactionRepository implements TransactionRepository {

	public void insert(Transaction transaction) {
		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL
			String sql = "insert into  transactions (id, amount, debit_credit, from_acc, to_acc) values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, transaction.getId());
			ps.setDouble(2, transaction.getAmount());
			ps.setBoolean(3, transaction.isCreditdebit());
			ps.setInt(4, transaction.getFromAcc());
			ps.setInt(5, transaction.getToAcc());
			// step-4 : excute jdbc-statements & process result-set
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("Transaction saved...");
			}
			// step-7 : close connection
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
