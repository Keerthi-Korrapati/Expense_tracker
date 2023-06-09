package com.et.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.et.entity.Expense;
import com.et.repository.ExpenseRepo;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	private ExpenseRepo expenseRepo;

	/*
	 * public List<Expense> getAllExpenses() { 
	 * return expenseRepo.findAll(); 
	 * }
	 */

	@Override
	public Page<Expense> getAllExpenses(Pageable page) {
		return expenseRepo.findAll(page);
	}

	@Override
	public Expense addExpense(Expense expenseObj) {
		expenseObj= expenseRepo.save(expenseObj);
		return expenseObj;
	}

	/*
	 * @Override public Expense getExpenseById(Long id) { Optional<Expense>
	 * exp=expenseRepo.findById(id); if(exp.isPresent()) { return exp.get(); } throw
	 * new ResourceNotFoundException("Expense Id is not available "+id); }
	 */

	@Override
	public void deleteExpenseById(Long id) {
		expenseRepo.deleteById(id);
		
	}

	@Override
	public Expense saveExpenseDetails(Expense expense) {
		return expenseRepo.save(expense);
	}

	/*
	 * @Override public Expense updateExpenseDetails(Long id, Expense expense) {
	 * Expense existingExpense = getExpenseById(id);
	 * existingExpense.setName(expense.getName() != null ? expense.getName() :
	 * existingExpense.getName());
	 * existingExpense.setDescription(expense.getDescription() != null ?
	 * expense.getDescription() : existingExpense.getDescription());
	 * existingExpense.setAmount(expense.getAmount() != null ? expense.getAmount() :
	 * existingExpense.getAmount());
	 * existingExpense.setCategory(expense.getCategory() != null ?
	 * expense.getCategory() : existingExpense.getCategory());
	 * existingExpense.setDate(expense.getDate() != null ? expense.getDate() :
	 * existingExpense.getDate()); return expenseRepo.save(existingExpense);
	 * 
	 * }
	 */

}
