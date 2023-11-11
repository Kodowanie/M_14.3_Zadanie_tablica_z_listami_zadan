package spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTaskToDoList(){
        tasks.add("a");
        tasks.add("b");
        tasks.add("c");
        return tasks;
    }

    public List<String> getTaskInProgressList(){
        tasks.add("d");
        tasks.add("e");
        tasks.add("f");
        return tasks;
    }

    @Override
    public String toString() {
        return '{' + "tasks=" + tasks + '}';
    }
}
