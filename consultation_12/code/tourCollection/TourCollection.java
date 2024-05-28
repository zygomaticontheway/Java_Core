package tourCollection;

import java.util.*;

public class TourCollection {
    private int maxSize;
    private int counter;
    private Queue<String> queries;

    public TourCollection(int maxSize) {
        this.maxSize = maxSize;
        this.queries = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Queue<String> getQueries() {
        return queries;
    }
    public boolean addNewQuery(String queryText) {
        if(counter < maxSize){
            queries.add(queryText);
            counter++;
            System.out.println("This query was added: " + queryText);
            return true;
        }
        System.out.println("Sorry, the queue of queries is full. Try later.");
        return false;
    }
    public void processRequest(){
        System.out.println();
        if (!queries.isEmpty()){
            queries.poll();
            counter--;
            System.out.println("Query has been processed");

        } else {
            System.out.println("The query list is empty");
        }
    }
    public int getQueueSize(){
        return counter;
    }

    @Override
    public String toString() {
        return "TourCollection{" +
                "maxSize=" + maxSize +
                ", queries=" + queries +
                '}';
    }
}
