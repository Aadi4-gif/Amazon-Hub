public class Issue {
    private String priority;
    private String status;

    public Issue(String priority, String status) {
        this.priority = priority;
        this.status = status;
    }

    public String getStatus(String status) {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
