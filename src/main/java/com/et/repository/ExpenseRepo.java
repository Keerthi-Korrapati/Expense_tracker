package com.et.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.et.entity.Expense;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense,Long> {

}
