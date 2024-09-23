package Main;

import Model.Expense;
import Model.Income;
import Model.User;
import Enum.IncomeTypeEnum;
import Enum.ExpenseType;
import Service.Expense.ExpenseService;
import Service.Expense.IExpenseService;
import Service.Income.IIncomeServices;
import Service.Income.IncomeServices;
import Service.User.IUserServices;
import Service.User.UserServices;

import java.time.LocalDateTime;

public class ExpenseManagerApp {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "Kohli@gmail.com", "Password");
        LocalDateTime currentTime = LocalDateTime.now();
        Income income = new Income(1, 100.00, IncomeTypeEnum.SALARY, currentTime, user);

        Expense expense = new Expense(1, 100.00, ExpenseType.TRAVEL, currentTime, user);

        IUserServices userServices = new UserServices();
        userServices.addIncome(income);
        userServices.addExpense(expense);
        userServices.getIncome();
        userServices.getExpenses();

        IIncomeServices incomeServices = new IncomeServices();
        incomeServices.addIncome(income);
        incomeServices.getIncomesByUser(user.getUserID());
        incomeServices.filterIncomesByDate(user.getUserID(), currentTime);
        incomeServices.deleteIncome(income.getIncomeID());

        IExpenseService expenseService = new ExpenseService();
        expenseService.addExpense(expense);
        expenseService.getExpensesByUser(user.getUserID());
        expenseService.filterExpensesByDate(user.getUserID(), currentTime);
        expenseService.deleteExpense(expense.getExpenseID());


    }
}
