package com.et.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Expenses_Tracker")
public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Expense name must not be blank")
	@Size(min=3,message="Expense name must atleast 3 characters")
	@Column(name="expense_name")
	private String name;
	
	@Column(name="expense_description")
	private String description;
	
	
	@Column(name="expense_amount")
	private BigDecimal amount;
	
	@Column(name="expense_category")
	private String category;
	
	@Column(name="date")
	private Date date;
	
	/*
	 * @Column(name = "created_at", nullable = false, updatable = false)
	 * 
	 * @CreationTimestamp private Timestamp createdAt;
	 * 
	 * @Column(name = "updated_at")
	 * 
	 * @UpdateTimestamp private Timestamp updatedAt;
	 * 
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

	

	

}
