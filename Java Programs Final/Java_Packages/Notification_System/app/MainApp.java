package app;

import service.TaskService;

public class MainApp {
    public static void main(String[] args) {
        new TaskService().notifyAllTasks();
    }
}
