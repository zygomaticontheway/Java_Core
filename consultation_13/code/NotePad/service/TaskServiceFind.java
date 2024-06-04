package NotePad.service;


import NotePad.dto.ClientResponse;
import NotePad.entity.Task;
import NotePad.repository.InMemoryRepository;

import java.util.List;
import java.util.Optional;

public class TaskServiceFind {
    private final InMemoryRepository repository;
    UserInput ui = new UserInput();

    public TaskServiceFind(InMemoryRepository repository) {
        this.repository = repository;
    }

    public ClientResponse<List<Task>> findAll(){

        List<Task> tasks = repository.findAll();

        if (!tasks.isEmpty()) {
            return new ClientResponse<>(200, tasks, List.of("Список задач"));
        } else {
            return new ClientResponse<>(250, tasks, List.of("База данных пуста"));
        }
    }

    public ClientResponse<Task> findById(){
        Integer id = ui.inputInt("Enter task ID: ");

        Optional<Task> foundedOptionalTask = repository.findById(id);

        if (foundedOptionalTask.isPresent()) {
            return new ClientResponse<>(200, foundedOptionalTask.get(), List.of("Найденный элемент"));
        } else {
            return new ClientResponse<>(400, new Task(), List.of("Элемент не найден"));
        }
    }

    public ClientResponse<List<Task>> findByName(){

        String name = ui.inputText("Enter task name:");

        List<Task> foundedTasks = repository.findByName(name);

        if (!foundedTasks.isEmpty()) {
            return new ClientResponse<>(200, foundedTasks, List.of("Найденные элементы"));
        } else {
            return new ClientResponse<>(400, foundedTasks, List.of("Элементы не найдены"));
        }
    }
    public void printAll(){
        System.out.println("All tasks:");
        List<Task> tasks = findAll().getResponseInfo();
        for (Task task : tasks) {
            System.out.println(task.getId() + ". " + task.getName());
            System.out.println(task.getDescription());
            System.out.println();
        }
    }
    public void printTaskById() {
        System.out.println("Found task:");
        Task task = findById().getResponseInfo();
        System.out.println(task.getId() + ". " + task.getName());
        System.out.println(task.getDescription());
    }
    public void printTaskByTaskName() {
        List<Task> tasks = findByName().getResponseInfo();

        System.out.println("Found tasks:");
        for (Task task : tasks) {
            System.out.println(task.getId() + ". " + task.getName());
            System.out.println(task.getDescription());
            System.out.println();
        }
    }
}
