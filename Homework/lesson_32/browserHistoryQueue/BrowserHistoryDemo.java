package lesson_32.browserHistoryQueue;

public class BrowserHistoryDemo {
    public static void main(String[] args) {
        BrowserHistoryQueue browserHistoryQueue = new BrowserHistoryQueue();
        browserHistoryQueue.addLinkToHistory("www.google.com");
        browserHistoryQueue.addLinkToHistory("www.yahoo.com");
        browserHistoryQueue.addLinkToHistory("www.web.de");
        browserHistoryQueue.addLinkToHistory("www.apple.com");
        browserHistoryQueue.addLinkToHistory("www.ya.ru");

        browserHistoryQueue.printBrowserHistory();

        browserHistoryQueue.removeLinkFromHistory("www.google.com");
        browserHistoryQueue.printBrowserHistory();





    }
}
