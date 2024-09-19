package Recording;

import java.time.LocalDateTime;

public class Recording implements IRecording {
    private int recordingID;
    private String filePath;
    private LocalDateTime date;

    public Recording(int recordingID, String filePath, LocalDateTime date) {
        this.recordingID = recordingID;
        this.filePath = filePath;
        this.date = date;
    }

    @Override
    public void startRecording() {
        System.out.println("Recording is started in Recording Table");
    }

    @Override
    public void stopRecording() {
        System.out.println("Recording is stopped in Recording Table");
    }
}
