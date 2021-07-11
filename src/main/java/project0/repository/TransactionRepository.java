package project0.repository;

import java.time.LocalDate;
import java.util.List;

import project0.entity.Transaction;

public interface TransactionRepository {
	void save(Transaction txn);

	List<Transaction> findByCount(int count, String accNum);
	List<Transaction> findByMonth(int count, String accNum);
	List<Transaction> findByDateRange(LocalDate fromDate,LocalDate toDate,String accNum);
}