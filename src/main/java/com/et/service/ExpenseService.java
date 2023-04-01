package com.et.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.et.entity.Expense;


public interface ExpenseService {
	
	//List<Expense> getAllExpenses();
	
	Page<Expense> getAllExpenses(Pageable page);
	
	Expense addExpense(Expense expenseObj);
	
	//Expense getExpenseById(Long id);
	
	void deleteExpenseById(Long id);
	
	Expense saveExpenseDetails(Expense expense);
	
	//Expense updateExpenseDetails(Long id,Expense expense);
		

}
