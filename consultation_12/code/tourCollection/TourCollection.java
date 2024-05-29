package tourCollection;

import java.util.*;

public class TourCollection {
    private int maxSize;
    private Queue<String> queries;

    public TourCollection(int maxSize) {
        this.maxSize = maxSize;
        this.queries = new ArrayDeque<>(){
        };
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Queue<String> getQueries() {
        return queries;
    }
    public void addNewQuery(String queryText) {
        if(queries.size() < maxSize){
            queries.add(queryText);
            System.out.println("This query was added: " + queryText);
            return;
        }
        System.out.println("Sorry, the queue of queries is full. Try later.");
    }
    public void processRequest(){
        System.out.println();
        if (!queries.isEmpty()){
            queries.poll();
            System.out.println("Query has been processed");

        } else {
            System.out.println("The query list is empty");
        }
    }
    public int getQueueSize(){
        return queries.size();
    }
    public void printQueries(){
        System.out.println("Queries are: ");
        System.out.println(queries);
    }

    @Override
    public String toString() {
        return "TourCollection{" +
                "maxSize=" + maxSize +
                ", queries=" + queries +
                '}';
    }
}
