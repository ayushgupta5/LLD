package Service.Income;

import Model.Income;

import java.time.LocalDateTime;

public class IncomeServices implements IIncomeServices {
    @Override
    public void addIncome(Income income) {
        System.out.println("Income Service is Adding the Income: " +income);
    }

    @Override
    public void getIncomesByUser(int userID) {
        System.out.println("Getting Income with UserID: " +userID);
    }

    @Override
    public void filterIncomesByDate(int userID, LocalDateTime date) {
        System.out.println("Filtering the Income with userID: " +userID+ " and Date: "+ date);
    }

    @Override
    public void deleteIncome(int incomeID) {
        System.out.println("Deleting the Income with incomeID: "  +incomeID);
    }
}
