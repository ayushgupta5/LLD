package Event;

import java.time.LocalDateTime;

public class Event implements IEvent {
    private int eventID;
    private String eventName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private String location;
    private boolean isRecurring;

    public Event(int eventID, String eventName, String description, String location, boolean isRecurring) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.startTime = LocalDateTime.now();
        this.endTime = LocalDateTime.now().plusHours(1);
        this.description = description;
        this.location = location;
        this.isRecurring = isRecurring;
    }

    public int getEventID() {
        return eventID;
    }

    @Override
    public void createEvent() {
        System.out.println("Creating the event");
    }

    @Override
    public void editEvent() {
        System.out.println("Editing the event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Deleting the event");
    }
}
