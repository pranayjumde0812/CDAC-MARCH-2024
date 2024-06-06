//2. Create a menu driven application "TaskManager" to manage your day-to-day tasks.
//
//You can create a class Task with fields like taskId, taskName, description, taskDate, status, active.
//taskId should be unique and generated automatically.
//status should be either PENDING, IN PROGRESS or COMPLETED.
//active should be either true or false. Deleted task will have active=false
//Newly added task should have default status as PENDING and active=true
//
//You can use suitable data structure to store data in memory.
//
//Following functionalities are expected -
//
//a. Add New Task
//b. Delete a task
//c. Update task status
//d. Display all pending tasks
//e. Display all pending tasks for today
//f. Display all tasks sorted by taskDate

import pojo.Task;
import pojo.TaskSortingOnTaskDate;

import java.util.*;

import static utils.TaskUtils.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Map<Integer, Task> taskMap = new HashMap<>();
            int choice;
            do {
                System.out.println("1. Add New Task\n2. Delete a Task\n3. Update task status" +
                        "\n4. Display all pending tasks\n5. Display all pending tasks for today" +
                        "\n6. Display all tasks sorted by taskDate\n0. Exit");

                choice = sc.nextInt();

                try {
                    switch (choice) {
                        case 1:
                            addNewTask(sc, taskMap);
                            break;
                        case 2:
                            deleteTask(sc, taskMap);
                            break;
                        case 3:
                            updateTaskStatus(sc, taskMap);
                            break;
                        case 4:
                            displayAllPendingTasks(taskMap);
                            break;
                        case 5:
                            displayAllPendingTaskForToday(taskMap);
                            break;
                        case 6:
                            Collection<Task> values = taskMap.values();
                            List<Task> taskList = new ArrayList<>(values);
                            Collections.sort(taskList, new TaskSortingOnTaskDate());
//                            taskList.sort(Comparator.comparing(Task::getTaskDate));
                            System.out.println("Sorted on Task date");
                            for (Task task : taskList) {
                                System.out.println(task);
                            }
                            break;
                        case 0:
                            System.out.println("Exiting......");
                            break;
                        default:
                            System.out.println("Invalid Choice...");
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    sc.nextLine();
                }
            } while (choice != 0);
        }
    }
}