package models;

public class Request {
    private final String id;
    private final String topic;
    private final String information;
    private final int isApproved;

    public Request(String id, String topic, String information, int isApproved) {
        this.id = id;
        this.topic = topic;
        this.information = information;
        this.isApproved = isApproved;
    }

    public String getId() {
        return id;
    }
    public String getInformation() {
        return information;
    }
    public int isApproved() {
        return isApproved;
    }

    public String getTopic() {
        return topic;
    }
}
