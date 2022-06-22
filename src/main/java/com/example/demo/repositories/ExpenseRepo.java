package com.example.demo.repositories;

import com.example.demo.entities.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// Expense Repository
@Repository
public interface ExpenseRepo extends CrudRepository<Expense,Integer> {
}
