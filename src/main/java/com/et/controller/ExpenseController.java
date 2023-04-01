package com.et.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.et.entity.Expense;
import com.et.service.ExpenseService;

import jakarta.validation.Valid;

@RestController
//@RequestMapping("/Expense")
public class ExpenseController {
	@Autowired
	private ExpenseService expenseService;

	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping("/addExpenses")
	public Expense saveExpenseDetails(@Valid @RequestBody Expense expense) {
		return expenseService.saveExpenseDetails(expense);
	}

	
	/*
	 * public Page<Expense> getAllExpenses(Pageable page) { return
	 * expenseService.getAllExpenses(page); }
	 */
	/*
	 * public List<Expense> getAllExpenses() { return
	 * expenseService.getAllExpenses(); }
	 */

	@GetMapping("/expenses")
	public List<Expense> getAllExpenses(Pageable page) {
		//int number=1;
		//calculateFactorial(number);
		return expenseService.getAllExpenses(page).toList();
	}

	/*
	 * @GetMapping("/expenses/{id}") public Expense
	 * getExpenseById(@PathVariable("id") Long id) { return
	 * expenseService.getExpenseById(id); }
	 */

	@ResponseStatus(value = HttpStatus.CREATED)
	@DeleteMapping("/expenses")
	public void deleteExpenseById(@RequestParam("id") Long id) {
		expenseService.deleteExpenseById(id);
	}

	/*
	 * @PutMapping("/updateexpenses/{id}") public Expense
	 * updateExpenseDetails(@RequestBody Expense expense, @PathVariable Long id) {
	 * return expenseService.updateExpenseDetails(id, expense); }
	 */
	/*
	 * public int calculateFactorial(int number) { return
	 * number*calculateFactorial(number-1); }
	 */
}






















