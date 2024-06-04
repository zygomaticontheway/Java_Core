package innerClass;

public class BicycleInnerClass {

    private String model;
    private int weight;
    private int seatDiameter;


    public BicycleInnerClass(String model, int weight, int seatDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatDiameter = seatDiameter;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public void createNewSeat(){
        Seat seat = new Seat();
    }

   public class HandelBar {
        private boolean isClean;

       public HandelBar(boolean isClean) {
           this.isClean = isClean;
       }
       public void right(){
           System.out.println("Turn right");
       }


       public void left(){
           System.out.println("Turn left");
       }
   }

    public class Seat {

        public void up(){
            System.out.println("Сиденье поднято вверх");
        }

        public void down(){
            System.out.println("Сиденье опущено вниз");
        }

        public void getSeatParam(){
            System.out.println("Параметры сиденья: " + seatDiameter);
        }

    }


}
