package project0.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project0.db.ConnectionFactory;
import project0.entity.Account;

public class JdbcAccountRepository implements AccountRepository {

	public List<Account> getAccounts() {

		Connection con = null;

		List<Account> accounts = new ArrayList<Account>();

		try {
			con = ConnectionFactory.getConnection();
			// step-3 : create jdbc-statements with SQL

			StringBuilder query = new StringBuilder("select * from accounts");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query.toString());

			while (rs.next()) {
				Account account = new Account();
				account.setId(rs.getInt(1));
				account.setBalance(rs.getDouble(2));
				accounts.add(account);
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
		return accounts;
	}
	
	

}
