package lesson_32.taskListDeque;

import Lesson18hw.company.UserInput;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class TaskListDeque {
    private Deque<String> deque;
    UserInput ui = new UserInput();

    public TaskListDeque() {
        this.deque = new LinkedList<>();
    }

    public Deque<String> getDeque() {
        return deque;
    }
    public Deque<String> addFirstTaskToDeque (String newTask){
        deque.addFirst(newTask);
        return deque;
    }
    public Deque<String> addLastTaskToDeque (String newTask){
        deque.addLast(newTask);
        return deque;
    }
    public Deque<String> completeTasksFromStart (){
        System.out.println("======= Tasks:");
        System.out.println(deque);
        int counter = ui.inputInt("Enter the amount of tasks to complete from the BEGINING:");
        if(counter >= 0) {
            for (int i = 0; i < counter; i++) {
                deque.pollFirst();
            }
        }
        System.out.println("Tasks left:" + '\n' + deque);
        return deque;
    }
    public Deque<String> completeTasksFromFinish (){
        System.out.println("======= Tasks:");
        System.out.println(deque);
        int counter = ui.inputInt("Enter the amount of tasks to complete from the END:");
        if(counter >= 0) {
            for (int i = 0; i < counter; i++) {
                deque.pollLast();
            }
        }
        System.out.println("Tasks left:" + '\n' + deque);

        return deque;
    }
    public void printDeque (){
        System.out.println(deque);
    }

    @Override
    public String toString() {
        return "TaskListDeque{" +
                "deque=" + deque +
                '}';
    }
}
