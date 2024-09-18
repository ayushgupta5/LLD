package Calender;

public class Calender implements ICalender {
    private int calenderID;
    private String calenderName;
    private int userID;

    public Calender(int calenderID, String calenderName, int userID) {
        this.calenderID = calenderID;
        this.calenderName = calenderName;
        this.userID = userID;
    }

    @Override
    public void createCalender() {
        System.out.println("Creating the Calender");
    }

    @Override
    public void deleteCalender() {
        System.out.println("Deleting the Calender");
    }

    @Override
    public void shareCalender() {
        System.out.println("Sharing the Calender");
    }
}
