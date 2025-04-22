package thiGK.ntu64130758.model;

public class TopicModel {
    private String id;
    private String topicName;
    private String supervisorID;
    private String topicType;

    public TopicModel(String id, String topicName, String supervisorID, String topicType) {
        this.id = id;
        this.topicName = topicName;
        this.supervisorID = supervisorID;
        this.topicType = topicType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(String supervisorID) {
        this.supervisorID = supervisorID;
    }

    public String getTopicType() {
        return topicType;
    }

    public void setTopicType(String topicType) {
        this.topicType = topicType;
    }
}
