package entity;

public class Group {
    private int id;
    private String group;

    public Group() {
    }

    public Group(int id, String group) {
        this.id = id;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group1 = (Group) o;

        if (id != group1.id) return false;
        return group != null ? group.equals(group1.group) : group1.group == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", group='" + group + '\'' +
                '}';
    }
}
