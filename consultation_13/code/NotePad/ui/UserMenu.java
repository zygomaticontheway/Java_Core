package NotePad.ui;

import NotePad.dto.ClientRequest;
import NotePad.service.TaskServiceAdd;
import NotePad.service.TaskServiceDelete;
import NotePad.service.TaskServiceFind;
import NotePad.service.UserInput;

public class UserMenu {
    private final TaskServiceAdd serviceAdd;
    private final TaskServiceFind serviceFind;
    private final TaskServiceDelete serviceDelete;
    UserInput ui = new UserInput();

    public UserMenu(TaskServiceAdd serviceAdd, TaskServiceFind serviceFind, TaskServiceDelete serviceDelete) {
        this.serviceAdd = serviceAdd;
        this.serviceFind = serviceFind;
        this.serviceDelete = serviceDelete;
    }

    private void printMenu(){
        System.out.println("1. Add task");
        System.out.println("2. Print all tasks");
        System.out.println("3. Find task by ID");
        System.out.println("4. Find task by task name");
        System.out.println("5. Delete task by ID");

        System.out.println("0. Exit");

    }
    public void menu(){
        while (true){
            System.out.println("-----------------------------");
            printMenu();
            int userChoice = ui.inputInt("Enter menu number:");

            switch (userChoice){
                case 1:
                    serviceAdd.add();
                    break;
                case 2:
                    serviceFind.printAll();
                    break;
                case 3:
                    serviceFind.printTaskById();
                    break;
                case 4:
                    serviceFind.printTaskByTaskName();
                    break;
                case 5:
                    serviceDelete.deleteById();
                    break;
                case 0:
                    System.out.println("The app has been shut down");
                    return;
            }
        }

    }
}
