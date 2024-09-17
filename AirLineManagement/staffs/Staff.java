package staffs;

public class Staff implements IStaff {
    private int staffID;
    private String name;
    private String role;
    private String assignedFlight;

    public Staff(int staffID, String name, String role, String assignedFlight) {
        this.staffID = staffID;
        this.name = name;
        this.role = role;
        this.assignedFlight = assignedFlight;
    }

    @Override
    public void assignFlight() {
        System.out.println("Staff is Assigned to a Flight");
    }

    @Override
    public void manageSchedule() {
        System.out.println("Manage Staff Schedule");
    }
}
