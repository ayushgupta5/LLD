package Service.Expense;

import Model.Expense;

import java.time.LocalDateTime;

public interface IExpenseService {
    void addExpense(Expense expense);
    void getExpensesByUser(int userID);
    void filterExpensesByDate(int userID, LocalDateTime date);
    void deleteExpense(int expenseID);
}
