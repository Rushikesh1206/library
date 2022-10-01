package com.cdac.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.pojo.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findByOrderBySrNrDesc();

	List<Transaction> findByBookId(int bookId);

	List<Transaction> findByRegNumber(Long regNumber);

	List<Transaction> findByActualReturnDate(Date date);

	List<Transaction> findByRegNumberAndActualReturnDate(Long regNumber, Date date);

}
