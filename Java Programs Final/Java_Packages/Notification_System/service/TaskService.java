package service;

public class TaskService {
    public void sendTaskNotification(String employee, String task) {
        System.out.println("📢 " + employee + ", you need to: " + task);
    }

    public void notifyAllTasks() {
        sendTaskNotification("Alice", "Submit monthly report");
        sendTaskNotification("Bob", "Review project proposal");
        sendTaskNotification("Charlie", "Update inventory list");
    }
}
