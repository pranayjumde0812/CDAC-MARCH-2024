package pojo;

import enums.TaskStatus;

import java.time.LocalDate;

public class Task {

    private int taskId;
    private String taskName;
    private String description;
    private LocalDate taskDate;
    private TaskStatus status;
    private boolean active;

    private static int id = 0;

    public Task() {
    }

    public Task(String taskName, String description, LocalDate taskDate) {

        this.taskId = ++id;
        this.taskName = taskName;
        this.description = description;
        this.taskDate = taskDate;
        this.active = true;
        this.status = TaskStatus.PENDING;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(LocalDate taskDate) {
        this.taskDate = taskDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", taskDate=" + taskDate +
                ", status=" + status +
                ", active=" + active +
                '}';
    }
}

//taskId, taskName, description, taskDate, status, active