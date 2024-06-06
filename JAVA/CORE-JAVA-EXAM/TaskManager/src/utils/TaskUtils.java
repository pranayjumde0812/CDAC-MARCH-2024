package utils;

import enums.TaskStatus;
import pojo.Task;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class TaskUtils {

    public static void addNewTask(Scanner sc, Map<Integer, Task> taskMap) {
        System.out.println("Enter the task details");
        System.out.println("Task Name");
        String taskName = sc.next();

        System.out.println("Task Date(yyyy-MM-dd)");
        String date = sc.next();

        // Clear the newline character from the buffer
        sc.nextLine();
        // Task Description
        System.out.println("Task Description (end with an empty line) write 'exit' to end :");
        StringBuilder descriptionBuilder = new StringBuilder();
        String line;
        while (!(line = sc.nextLine()).isEmpty() && !line.contains("exit")) {
            descriptionBuilder.append(line).append("\n");
        }
        String description = descriptionBuilder.toString().trim();  // Remove the trailing newline
        sc.nextLine();

        Task task = new Task(taskName, description, LocalDate.parse(date));

        taskMap.put(task.getTaskId(), task);
    }

    public static void deleteTask(Scanner sc, Map<Integer, Task> taskMap) {
        System.out.println("Enter the TaskId to delete a task : ");
        int id = sc.nextInt();

        if (taskMap.containsKey(id)) {

            Task task = taskMap.get(id);
            if (task.isActive() && task.getStatus() != TaskStatus.DELETED) {
                // setting the active to false means not hardcode delete
                task.setActive(false);
                task.setStatus(TaskStatus.DELETED);
                System.out.println("Deleted successfully");
            } else System.out.println("Already deleted");
        } else {
            System.out.println("Invalid task Id");
        }
    }

    public static void updateTaskStatus(Scanner sc, Map<Integer, Task> taskMap) {
        System.out.println("Enter the Task Id");
        int id = sc.nextInt();
        if (taskMap.containsKey(id)) {
            Task task = taskMap.get(id);
            System.out.println("Enter the choice: \n1. PENDING 2. IN_PROGRESS 3. COMPLETED");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    task.setStatus(TaskStatus.PENDING);
                    System.out.println("The task " + task.getTaskName() + " updated " + TaskStatus.PENDING + " state");
                    break;
                case 2:
                    task.setStatus(TaskStatus.IN_PROGRESS);
                    System.out.println("The task " + task.getTaskName() + " updated " + TaskStatus.IN_PROGRESS + " state");
                    break;
                case 3:
                    task.setStatus(TaskStatus.COMPLETED);
                    System.out.println("The task " + task.getTaskName() + " updated " + TaskStatus.COMPLETED + " state");
                    break;
            }
        } else {
            System.out.println("Invalid task Id");
        }
    }

    public static void displayAllPendingTasks(Map<Integer, Task> taskMap) {
        for (Task task : taskMap.values()) {
            if (task.getStatus() == TaskStatus.PENDING) {
                System.out.println(task);
            }
        }
    }

    public static void displayAllPendingTaskForToday(Map<Integer, Task> taskMap) {
        for (Task task : taskMap.values()) {
            if (task.getStatus() == TaskStatus.PENDING && task.getTaskDate().isEqual(LocalDate.now())) {
                System.out.println(task);
            }
        }
    }

    public static void display(Map<Integer, Task> taskMap) {
        for (Task task : taskMap.values()) {
            System.out.println(task);
        }
    }


}
