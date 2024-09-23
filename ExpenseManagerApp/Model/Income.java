package Model;

import Enum.IncomeTypeEnum;

import java.time.LocalDateTime;

public class Income {
    private int incomeID;
    private double amount;
    private IncomeTypeEnum incomeType;
    private LocalDateTime date;
    private User user;

    public Income(int incomeID, double amount, IncomeTypeEnum incomeType, LocalDateTime date, User user) {
        this.incomeID = incomeID;
        this.amount = amount;
        this.incomeType = incomeType;
        this.date = date;
        this.user = user;
    }

    public int getIncomeID() {
        return incomeID;
    }

    public void setIncomeID(int incomeID) {
        this.incomeID = incomeID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public IncomeTypeEnum getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(IncomeTypeEnum incomeType) {
        this.incomeType = incomeType;
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
