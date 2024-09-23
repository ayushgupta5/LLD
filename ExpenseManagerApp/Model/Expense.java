package Model;

import Enum.ExpenseType;
import java.time.LocalDateTime;

public class Expense {
    private int expenseID;
    private double amount;
    private ExpenseType type;
    private LocalDateTime date;
    private User user;

    public Expense(int expenseID, double amount, ExpenseType type, LocalDateTime date, User user) {
        this.expenseID = expenseID;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.user = user;
    }

    public int getExpenseID() {
        return expenseID;
    }

    public void setExpenseID(int expenseID) {
        this.expenseID = expenseID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseType getType() {
        return type;
    }

    public void setType(ExpenseType type) {
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
