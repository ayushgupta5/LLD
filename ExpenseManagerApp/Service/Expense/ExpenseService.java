package Service.Expense;

import Model.Expense;

import java.time.LocalDateTime;

public class ExpenseService implements IExpenseService {
    @Override
    public void addExpense(Expense expense) {
        System.out.println("Adding the Expense: "+expense);
    }

    @Override
    public void getExpensesByUser(int userID) {
        System.out.println("Getting the Expense with userID: " +userID);
    }

    @Override
    public void filterExpensesByDate(int userID, LocalDateTime date) {
        System.out.println("Filtering the Expense by UserID: "+userID+ " and Date: " +date);
    }

    @Override
    public void deleteExpense(int expenseID) {
        System.out.println("Deleting the Expense with expenseID");
    }
}
