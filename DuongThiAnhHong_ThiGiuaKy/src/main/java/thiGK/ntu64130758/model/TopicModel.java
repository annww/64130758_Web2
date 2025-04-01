package thiGK.ntu64130758.model;

public class TopicModel {
    private String id;
    private String name;
    private String groupID;

    public TopicModel() {}

    public TopicModel(String id, String name, String groupID) {
        this.id = id;
        this.name = name;
        this.groupID = groupID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

}
