public class Dancer extends Person {
    private String groupName;
    private String dancing;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName, String learn, String walk, String eat, String dancing) {
        super(name, designation, learn, walk, eat);
        this.groupName = groupName;
        this.dancing = dancing;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDancing() {
        return dancing;
    }

    public void setDancing(String dancing) {
        this.dancing = dancing;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nGroup name: " + groupName +
                "\nDancing: " + dancing ;
    }
}
