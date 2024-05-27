package lesson_32.taskListDeque;

public class TaskListDequeDemo {
    public static void main(String[] args) {
        TaskListDeque deque = new TaskListDeque();
        deque.addFirstTaskToDeque("Go home");
        deque.addFirstTaskToDeque("Do HW");
        deque.addLastTaskToDeque("Chill");
        deque.addFirstTaskToDeque("Write to wife how do you love her");

        deque.completeTasksFromStart();

        deque.completeTasksFromFinish();
    }
}
