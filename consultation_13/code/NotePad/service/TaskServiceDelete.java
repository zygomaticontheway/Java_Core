package NotePad.service;


import NotePad.entity.Task;
import NotePad.repository.InMemoryRepository;
import java.util.Optional;

public class TaskServiceDelete {
    private final InMemoryRepository repository;
    UserInput ui = new UserInput();

    public TaskServiceDelete(InMemoryRepository repository) {
        this.repository = repository;
    }

    public boolean deleteById(){
        Integer id = ui.inputInt("Enter task ID for delete: ");

        Optional<Task> foundedOptionalTask = repository.findById(id);

        if (foundedOptionalTask.isPresent()) {
            return repository.delete(id);
        } else {
            return false;
        }
    }
    public boolean deleteByTask(Task task){

        Optional<Task> foundedOptionalTask = repository.findById(task.getId());

        if (foundedOptionalTask.isPresent()) {
            return repository.delete(task);
        } else {
            return false;
        }
    }

}
