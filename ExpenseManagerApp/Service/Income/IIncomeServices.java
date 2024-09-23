package Service.Income;

import Model.Income;

import java.time.LocalDateTime;

public interface IIncomeServices {
    void addIncome(Income income);
    void getIncomesByUser(int userID);
    void filterIncomesByDate(int userID, LocalDateTime date);
    void deleteIncome(int incomeID);
}
