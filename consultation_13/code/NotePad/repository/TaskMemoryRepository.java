package NotePad.repository;


import NotePad.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskMemoryRepository implements InMemoryRepository{

    private int taskId = 0;

    private List<Task> tasks;

    public TaskMemoryRepository() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public Task add(Task task) {
        taskId++;
        Task newTask = new Task(taskId, task.getName(), task.getDescription());
        tasks.add(newTask);
        return newTask;
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }

    @Override
    public Optional<Task> findById(Integer id) {
        for (Task task : tasks){
            if (task.getId().equals(id)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Task> findByName(String name) {
        List<Task> taskListByName = new ArrayList<>();
        for (Task task : tasks){
            if (task.getName().equals(name)) {
                taskListByName.add(task);
            }
        }
        return taskListByName;
    }

    @Override
    public boolean delete(Integer id) {
        Optional<Task> taskById = findById(id);
        if (taskById.isPresent()) {
            Task taskForDelete = taskById.get();
            tasks.remove(taskForDelete);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Task task) {
        return tasks.remove(task);
    }
}
