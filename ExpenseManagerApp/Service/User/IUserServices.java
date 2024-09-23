package Service.User;

import Model.Expense;
import Model.Income;

public interface IUserServices {
    void addIncome(Income income);
    void addExpense(Expense expense);
    void getIncome();
    void getExpenses();
}
