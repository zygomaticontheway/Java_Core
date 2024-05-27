package lesson_32.browserHistoryQueue;

import java.util.Stack;

public class BrowserHistoryQueue {
    private Stack<String> browserHistoryQueue;

    public BrowserHistoryQueue() {
        this.browserHistoryQueue = new Stack<String>();
    }

    public Stack<String> getBrowserHistoryQueue() {
        return browserHistoryQueue;
    }

    public Stack<String> addLinkToHistory (String newLink){
        browserHistoryQueue.push(newLink);
        return browserHistoryQueue;
    }
    public Stack<String> removeLastLinkFromHistory (){
        browserHistoryQueue.pop();
        return browserHistoryQueue;
    }

    public Stack<String> removeLinkFromHistory(String link){
        int counter = browserHistoryQueue.search(link);
        System.out.println("Search index of the link is: " + counter);
        if (counter > 0) {
            for (int i = 0; i < counter; i++) {
                browserHistoryQueue.pop();
            }
        }
        return browserHistoryQueue;
    }

    public void printBrowserHistory() {
        System.out.println(browserHistoryQueue.toString());
    }
}
