package Service.User;

import Model.Expense;
import Model.Income;

public class UserServices implements IUserServices {

    @Override
    public void addIncome(Income income) {
        System.out.println("User is Adding the Income: " +income);
    }

    @Override
    public void addExpense(Expense expense) {
        System.out.println("User is Adding the Expense: " +expense);
    }

    @Override
    public void getIncome() {
        System.out.println("Getting the User's Income");
    }

    @Override
    public void getExpenses() {
        System.out.println("Getting the User's Expenses");
    }
}
