package spring.portfolio;

import java.util.List;

public final class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList(List<String>value){
        toDoList.getTaskToDoList();
        return toDoList;
    }

    public TaskList getInProgressList(List<String>value){
        inProgressList.getTaskInProgressList();
        return inProgressList;
    }

    public TaskList getDoneList(){
        return doneList;
    }

}
