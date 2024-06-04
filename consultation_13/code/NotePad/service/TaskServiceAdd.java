package NotePad.service;


import NotePad.dto.ClientRequest;
import NotePad.dto.ClientResponse;
import NotePad.entity.Task;
import NotePad.repository.InMemoryRepository;
import NotePad.service.validation.ValidationService;

import java.util.List;

public class TaskServiceAdd {

    private final InMemoryRepository repository;
    private final ValidationService validation;
    UserInput ui = new UserInput();

    public TaskServiceAdd(InMemoryRepository repository, ValidationService validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public ClientResponse<Task> add(){
        ClientRequest request = inputNewTask();
        List<String> errors = validation.checkRequest(request);

        if (errors.isEmpty()) {
            Task taskForAdd = new Task(0, request.getName(), request.getDescription());
            Task taskAfterAdd = repository.add(taskForAdd);
            return new ClientResponse<>(200, taskAfterAdd, List.of("Добавление новой задачи прошло успешно"));
        } else {
            return new ClientResponse<>(400, new Task(), errors);
        }
    }
    public ClientRequest inputNewTask(){
        String name = ui.inputText("Enter task name:");
        String description = ui.inputText("Enter task description:");

        return new ClientRequest(name, description);
    }
}
