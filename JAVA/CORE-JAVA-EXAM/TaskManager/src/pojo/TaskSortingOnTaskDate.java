package pojo;

import java.util.Comparator;

public class TaskSortingOnTaskDate implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {

        return o1.getTaskDate().compareTo(o2.getTaskDate());
    }
}
