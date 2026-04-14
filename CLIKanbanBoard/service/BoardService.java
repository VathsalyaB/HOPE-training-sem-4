package service;

import java.util.*;
import model.Status;
import model.Task;

public class BoardService {
    private List<Task> tasks = new ArrayList<>();
    private int idCounter = 1;

    public void addTask(String title) {
        Task task = new Task(idCounter++, title);
        tasks.add(task);
    }

    public void moveTask(int taskId, Status newStatus) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setStatus(newStatus);
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void displayBoard() {
        System.out.println("\n=== KANBAN BOARD ===");

        for (Status status : Status.values()) {
            System.out.println("\n" + status + ":");
            for (Task task : tasks) {
                if (task.getStatus() == status) {
                    System.out.println(task.getId() + " - " + task.getTitle());
                }
            }
        }
    }
}