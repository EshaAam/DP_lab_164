package Models;

public class Notification {
    private String id;
    private String message;
    private String platform;
    private boolean isRead;

    public Notification(String id, String message, String platform, boolean isRead) {
        this.id = id;
        this.message = message;
        this.platform = platform;
        this.isRead = isRead;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", platform='" + platform + '\'' +
                ", isRead=" + isRead +
                '}';
    }
}
