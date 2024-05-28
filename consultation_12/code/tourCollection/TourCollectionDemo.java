package tourCollection;

public class TourCollectionDemo {
    public static void main(String[] args) {
        TourCollection tourCollection = new TourCollection(4);

        tourCollection.addNewQuery("Thailand 12 nights ASAP");
        tourCollection.addNewQuery("Bali 24 nights Jun");
        tourCollection.addNewQuery("Yerevan 7 nights July");
        tourCollection.addNewQuery("Spain 3 nights this weekend");

        tourCollection.processRequest();

        tourCollection.addNewQuery("Spain 4 nights this weekend");


        tourCollection.addNewQuery("Spain 5 nights this weekend");



    }
}
