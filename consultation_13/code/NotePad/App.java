package NotePad;

import NotePad.repository.InMemoryRepository;
import NotePad.repository.TaskMemoryRepository;
import NotePad.service.TaskServiceAdd;
import NotePad.service.TaskServiceDelete;
import NotePad.service.TaskServiceFind;
import NotePad.service.validation.ValidationService;
import NotePad.ui.UserMenu;


public class App {
    public static void main(String[] args) {

        InMemoryRepository repository = new TaskMemoryRepository();
        ValidationService validationService = new ValidationService();

        TaskServiceAdd taskServiceAdd = new TaskServiceAdd(repository,validationService);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);
        TaskServiceDelete taskServiceDelete = new TaskServiceDelete(repository);

        UserMenu userMenu = new UserMenu(taskServiceAdd,taskServiceFind,taskServiceDelete);

        userMenu.menu();


    }
}
